
import java.util.Scanner;
public class MultiplesBelowHundredFor {
    public static void main(String[] args) {
        //Take input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Multiples below 100 logic using for loop
        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--) {
                //Check if i is a multiple of number if true print it
                if (i % number == 0)
                    System.out.println(i);
            }
        } 
        
    
        else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}
