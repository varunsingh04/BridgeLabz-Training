import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int number = input.nextInt(); // user input

        //Validate input for natural number
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int factorial = 1; 
        int counter = 1; // initialize counter

        while (counter <= number) {
            factorial *= counter;
            counter++;
        }

        System.out.println("Factorial = " + factorial);

        input.close();
    }
}
