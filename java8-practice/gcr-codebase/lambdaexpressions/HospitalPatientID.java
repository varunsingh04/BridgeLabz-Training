import java.util.*;

public class HospitalPatientID {

    public static void main(String[] args) {

        List<Integer> patientIds = Arrays.asList(101, 102, 103, 104);

        System.out.println("Patient IDs:");
        patientIds.forEach(System.out::println);
    }
}
