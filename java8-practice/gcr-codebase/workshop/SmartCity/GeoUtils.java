package SmartCityTransport;



public interface GeoUtils {
    
    static double calculateDistance(Location a, Location b) {
        double R = 6371e3; // metres
        double phi1 = Math.toRadians(a.getLat());
        double phi2 = Math.toRadians(b.getLat());
        double dphi = Math.toRadians(b.getLat() - a.getLat());
        double dlambda = Math.toRadians(b.getLon() - a.getLon());

        double sin1 = Math.sin(dphi / 2);
        double sin2 = Math.sin(dlambda / 2);
        double hav = sin1 * sin1 + Math.cos(phi1) * Math.cos(phi2) * sin2 * sin2;
        double c = 2 * Math.atan2(Math.sqrt(hav), Math.sqrt(1 - hav));
        double distanceMeters = R * c;
        return distanceMeters / 1000.0; // km
    }
}
