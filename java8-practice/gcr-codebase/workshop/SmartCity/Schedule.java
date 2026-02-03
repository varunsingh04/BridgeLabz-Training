package SmartCityTransport;



import java.time.LocalDateTime;

public class Schedule {
    private final String id;
    private final String routeId;
    private final LocalDateTime departure;
    private final double baseFare; // base fare 

    public Schedule(String id, String routeId, LocalDateTime departure, double baseFare) {
        this.id = id;
        this.routeId = routeId;
        this.departure = departure;
        this.baseFare = baseFare;
    }

    public String getId() {
        return id;
    }

    public String getRouteId() {
        return routeId;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public double getBaseFare() {
        return baseFare;
    }

    @Override
    public String toString() {
        return String.format("Schedule[id=%s, route=%s, dep=%s, fare=%.2f]", id, routeId, departure, baseFare);
    }
}

