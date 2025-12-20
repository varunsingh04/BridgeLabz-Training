import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble(); // user input salary
        int yearsOfService = input.nextInt(); // user input years of service

        //Control flow to determine bonus eligibility and display bonus amount
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("No bonus applicable.");
        }

        input.close();
    }
}
