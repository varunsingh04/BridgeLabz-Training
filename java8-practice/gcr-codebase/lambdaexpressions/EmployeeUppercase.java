import java.util.*;
import java.util.stream.*;

public class EmployeeUppercase {

    public static void main(String[] args) {

        List<String> employees = Arrays.asList("varun", "rohit", "neha");

        System.out.println("Uppercase Employee Names:");
        employees.stream()
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
}
