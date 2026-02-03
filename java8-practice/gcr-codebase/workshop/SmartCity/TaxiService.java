package SmartCityTransport;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TaxiService implements TransportService {
    private final String id;
    private final String name;
    private final List<Schedule> schedules = new ArrayList<>();
    private final FareCalculator fareCalculator;

    public TaxiService(String id, String name) {
        this(id, name, FareUtils::calculateTaxiFare); // method reference to static utility method
    }

    public TaxiService(String id, String name, FareCalculator calculator) {
        this.id = id;
        this.name = name;
        this.fareCalculator = calculator;
    }

    public double estimateFare(Trip trip) {
        return fareCalculator.calculateFare(trip);
    }

    public void addSchedule(Schedule s) {
        schedules.add(s);
    }

    @Override
    public String getServiceId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Schedule> getSchedules() {
        return Collections.unmodifiableList(schedules);
    }

    public Optional<Schedule> earliestAfter(java.time.LocalDateTime t) {
        return schedules.stream().filter(s -> s.getDeparture().isAfter(t)).sorted((a, b) -> a.getDeparture().compareTo(b.getDeparture())).findFirst();
    }
}

