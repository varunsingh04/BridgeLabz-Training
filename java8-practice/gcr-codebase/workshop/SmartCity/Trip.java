package SmartCityTransport;



import java.time.LocalDateTime;

public class Trip {
    private final String id;
    private final Passenger passenger;
    private final String routeId;
    private final Location from;
    private final Location to;
    private final LocalDateTime requestedAt;

    public Trip(String id, Passenger passenger, String routeId, Location from, Location to, LocalDateTime requestedAt) {
        this.id = id;
        this.passenger = passenger;
        this.routeId = routeId;
        this.from = from;
        this.to = to;
        this.requestedAt = requestedAt;
    }

    public String getId() {
        return id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getRouteId() {
        return routeId;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }

    public LocalDateTime getRequestedAt() {
        return requestedAt;
    }

    public double getDistanceKm() {
        return GeoUtils.calculateDistance(from, to);
    }

    @Override
    public String toString() {
        return String.format("Trip[id=%s, passenger=%s, route=%s, from=%s, to=%s]", id, passenger.getName(), routeId, from, to);
    }
}

