
import java.util.Scanner;
public class OddEvenCheck {
    public static void main(String[] args) {
        // Take input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        // Check and print whether numbers from 1 to num are odd or even
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is even");
                else
                    System.out.println(i + " is odd");
            }
        } else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}
