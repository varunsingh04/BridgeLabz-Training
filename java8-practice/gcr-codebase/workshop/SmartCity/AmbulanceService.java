package SmartCityTransport;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AmbulanceService implements TransportService, EmergencyService {
    private final String id;
    private final String name;
    private final List<Schedule> schedules = new ArrayList<>();

    public AmbulanceService(String id, String name) {
        this.id = id;
        this.name = name;
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
}
