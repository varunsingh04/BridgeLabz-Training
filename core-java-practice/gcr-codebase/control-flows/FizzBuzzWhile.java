
import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        //Take input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //FizzBuzz logic using while loop
        int i = 1;
        if (number > 0) {
            while (i <= number) {
                //Check divisibility and print appropriate output
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                
                else if (i % 5 == 0)
                    System.out.println("Buzz");

                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else

                    System.out.println(i);

                i++;
            }
        } 
        else {
            System.out.println("Invalid input");
        }
        input.close();
    }
}
