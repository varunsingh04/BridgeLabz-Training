package SmartCityTransport;



public final class FareUtils {
    private FareUtils() {}

    public static double baseFareByDistance(double km, double perKmRate) {
        return Math.max(2.0, km * perKmRate); // minimum 
    }

    public static double calculateTaxiFare(Trip trip) {
  
        double perKm = 1.5;
        return baseFareByDistance(trip.getDistanceKm(), perKm);
    }

    public static double calculateMetroFare(Trip trip) {
        
        return 1.25; //single flat rate
    }
}
