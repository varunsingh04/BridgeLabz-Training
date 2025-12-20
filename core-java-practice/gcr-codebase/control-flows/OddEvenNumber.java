import java.util.*;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); // user input

        //Validate is natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number.");
            return;
            
        }

        //Loop to check odd/even for numbers from 1 to n
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
        
        
    }
}
