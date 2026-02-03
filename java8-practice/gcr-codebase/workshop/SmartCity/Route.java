package SmartCityTransport;



public class Route {
    private final String id;
    private final String name;
    private final Location start;
    private final Location end;

    public Route(String id, String name, Location start, Location end) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Location getStart() {
        return start;
    }

    public Location getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return String.format("Route[%s:%s]", id, name);
    }
}
