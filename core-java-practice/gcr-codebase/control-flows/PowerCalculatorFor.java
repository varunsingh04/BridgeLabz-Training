import java.util.Scanner;
public class PowerCalculatorFor {
    public static void main(String[] args) {
        //Take input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        
        //Power of a number calculation logic using for loop 
        int result = 1;
        for (int i = 1; i <= power; i++){
            result *= number;
        }
            
        System.out.println("Result: " + result);

        input.close();
    }
}