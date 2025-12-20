import java.util.*;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); // user input

        //Validate input for natural number
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int factorial = 1;
        //For loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
        
        input.close();

    }
}
