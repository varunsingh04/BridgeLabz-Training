package SmartCityTransport;



import java.util.List;

public interface TransportService {
    String getServiceId();
    String getName();
    List<Schedule> getSchedules();

    
    default void printServiceDetails() {
        System.out.println("Service: " + getName() + " (id:" + getServiceId() + ")");
        getSchedules().forEach(System.out::println);
    }
}
