package SmartCityTransport;



public class Location {
    private final double lat;
    private final double lon;

    public Location(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    @Override
    public String toString() {
        return String.format("(%.5f, %.5f)", lat, lon);
    }
}

