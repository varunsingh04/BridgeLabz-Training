import java.util.Scanner;
public class GreatestFactorFor {
    public static void main(String[] args) {
        //Take input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Greatest factor logic using for loop
        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor = " + greatestFactor);

        input.close();
    }
}