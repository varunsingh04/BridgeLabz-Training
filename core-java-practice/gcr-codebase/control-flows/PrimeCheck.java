
import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        //Take input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Prime number check logic
        boolean isPrime = true;
        if (number <= 1) isPrime = false;

        //Check for factors from 2 to num/2
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        //Output result
        if(isPrime){
            System.out.println("Prime Number");
            
        }
        else{
            System.out.println("Not a Prime Number");
        }
        input.close();
    }
}
