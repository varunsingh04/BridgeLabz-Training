import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        // Take input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // Harshad number check logic
        int sum = 0;
        int n = number; // Use a separate variable to preserve the original number

        
        // Calculate the sum of digits
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        // Output result
        if (number % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");

        input.close();
    }
}