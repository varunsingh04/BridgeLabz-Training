package SmartCityTransport;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        simulate();
    }

    private static void simulate() {
        LocalDateTime now = LocalDateTime.now();

        // Routes
        Route downtown = new Route("R1", "GLA", new Location(12.9716, 77.5946), new Location(12.975, 77.59));
        Route airport = new Route("R2", "Yamuna Express Way", new Location(12.95, 77.55), new Location(13.0, 77.65));

        // Services
        BusService bus = new BusService("B1", "CityBus-1");
        bus.addSchedule(new Schedule("S1", downtown.getId(), now.plusMinutes(10), 1.5));
        bus.addSchedule(new Schedule("S2", airport.getId(), now.plusMinutes(40), 3.0));

        MetroService metro = new MetroService("M1", "Metro");
        metro.addSchedule(new Schedule("S3", downtown.getId(), now.plusMinutes(5), 1.0));
        metro.addSchedule(new Schedule("S4", airport.getId(), now.plusMinutes(30), 2.5));

        TaxiService taxi = new TaxiService("T1", "CityTaxi");
        taxi.addSchedule(new Schedule("S5", downtown.getId(), now.plusMinutes(2), 0.0));

        AmbulanceService ambulance = new AmbulanceService("E1", "Ambulance-1");
        ambulance.addSchedule(new Schedule("S6", downtown.getId(), now.plusMinutes(1), 0.0));

        // Registry of services
        List<TransportService> services = new ArrayList<>();
        services.add(bus);
        services.add(metro);
        services.add(taxi);
        services.add(ambulance);

        
        System.out.println("\n=== Live Service Schedules ===");
        services.forEach(TransportService::printServiceDetails); // default method & method reference

        // Create passengers and trips (booking requests)
        Passenger p1 = new Passenger("P1", "Alice", 30);
        Passenger p2 = new Passenger("P2", "Bob", 45);
        Passenger p3 = new Passenger("P3", "Charlie", 22);

        List<Trip> tripRequests = new ArrayList<>();
        tripRequests.add(new Trip("TReq1", p1, downtown.getId(), downtown.getStart(), downtown.getEnd(), now));
        tripRequests.add(new Trip("TReq2", p2, airport.getId(), airport.getStart(), airport.getEnd(), now.plusMinutes(3)));
        tripRequests.add(new Trip("TReq3", p3, downtown.getId(), downtown.getStart(), downtown.getEnd(), now.plusMinutes(4)));

        // Booking engine: filter and sort services using lambdas
        List<Booking> bookings = tripRequests.stream().map(req -> {
            // candidates: services that serve the route with an available schedule after requested time
            List<TransportService> candidates = services.stream()
                    .filter(s -> s.getSchedules().stream().anyMatch(sc -> sc.getRouteId().equals(req.getRouteId()) && sc.getDeparture().isAfter(req.getRequestedAt())))
                    .collect(Collectors.toList());

            if (candidates.isEmpty()) {
                System.out.println("No candidates for trip: " + req);
                return null;
            }

            // map candidate -> cheapest earliest schedule
            Optional<Booking> chosen = candidates.stream().map(s -> {
                Schedule sched = s.getSchedules().stream()
                        .filter(sc -> sc.getRouteId().equals(req.getRouteId()) && sc.getDeparture().isAfter(req.getRequestedAt()))
                        .min(Comparator.comparing(Schedule::getDeparture)).get();

                double fare;
                if (s instanceof TaxiService) {
                    fare = ((TaxiService) s).estimateFare(req); // method call
                } else if (s instanceof MetroService) {
                    fare = ((MetroService) s).estimateFare(req);
                } else {
                    fare = sched.getBaseFare();
                }
                return new Booking(req, s, fare, sched);
            }).min(Comparator.comparingDouble(b -> b.fare));

            if (!chosen.isPresent()) {
                System.out.println("No suitable booking for: " + req);
                return null;
            }
            Booking b = chosen.get();
            System.out.println(String.format("Booked: %s via %s at fare=%.2f (dep=%s)", req.getPassenger(), b.service.getName(), b.fare, b.schedule.getDeparture()));
            return b;
        }).filter(b -> b != null).collect(Collectors.toList());

        // Revenue reports using Collectors (groupingBy, partitioningBy, summarizingDouble)
        System.out.println("\n=== Revenue by Route (groupingBy + summingDouble) ===");
        Map<String, Double> revenueByRoute = bookings.stream()
                .collect(Collectors.groupingBy(b -> b.trip.getRouteId(), Collectors.summingDouble(b -> b.fare)));
        revenueByRoute.forEach((route, amt) -> System.out.println(route + " => " + amt));

        System.out.println("\n=== Peak vs Non-peak Revenue (partitioningBy + summingDouble) ===");
        Map<Boolean, Double> peakPartition = bookings.stream()
                .collect(Collectors.partitioningBy(b -> isPeak(b.trip.getRequestedAt()), Collectors.summingDouble(b -> b.fare)));
        System.out.println("Peak => " + peakPartition.get(true) + ", Non-peak => " + peakPartition.get(false));

        System.out.println("\n=== Fare Summary (summarizingDouble) ===");
        java.util.DoubleSummaryStatistics stats = bookings.stream().collect(Collectors.summarizingDouble(b -> b.fare));
        System.out.println("count=" + stats.getCount() + ", total=" + stats.getSum() + ", avg=" + stats.getAverage());

        // Group passengers by route (groupingBy + mapping)
        System.out.println("\n=== Passengers by Route (groupingBy + mapping) ===");
        Map<String, java.util.List<Passenger>> paxByRoute = bookings.stream().collect(
                Collectors.groupingBy(b -> b.trip.getRouteId(), Collectors.mapping(b -> b.trip.getPassenger(), Collectors.toList())));
        paxByRoute.forEach((r, list) -> System.out.println(r + " -> " + list));

        // Summarize distances using GeoUtils (static method) + method reference
        System.out.println("\n=== Distances for Bookings (using GeoUtils.calculateDistance) ===");
        bookings.forEach(b -> System.out.println(b.trip.getId() + " distance(km)=" + String.format("%.3f", b.trip.getDistanceKm())));

        // Emergency services prioritized (marker interface usage)
        System.out.println("\n=== Emergency Services (marker interface) ===");
        services.stream().filter(s -> s instanceof EmergencyService).forEach(s -> System.out.println("PRIORITY: " + s.getName()));

        // Showing an example of a FareCalculator lambda (custom pricing, functional interface)
        FareCalculator promoCalc = trip -> FareUtils.baseFareByDistance(trip.getDistanceKm(), 1.0) * 0.9; // 10% discount promo
        System.out.println("\nPromo fare example for " + tripRequests.get(0).getPassenger() + " => " + promoCalc.calculateFare(tripRequests.get(0)));

        System.out.println("\n=== Dashboard: Active Schedules (forEach) ===");
        services.stream().flatMap(s -> s.getSchedules().stream()).forEach(System.out::println); // forEach method

        System.out.println("\nSimulation complete.");
    }

    private static boolean isPeak(LocalDateTime t) {
        int h = t.getHour();
        return (h >= 7 && h <= 9) || (h >= 17 && h <= 19);
    }

    // Small booking record used in the demo
    private static class Booking {
        final Trip trip;
        final TransportService service;
        final double fare;
        final Schedule schedule;

        Booking(Trip trip, TransportService service, double fare, Schedule schedule) {
            this.trip = trip;
            this.service = service;
            this.fare = fare;
            this.schedule = schedule;
        }
    }
}
