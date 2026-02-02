package SmartCityTransport;


@FunctionalInterface
public interface FareCalculator {
    double calculateFare(Trip trip);
}

