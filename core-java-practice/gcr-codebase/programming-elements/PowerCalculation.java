import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt(); //user inputs base
        int exponent = input.nextInt(); //user inputs exponent

        double result = Math.pow(base, exponent); //formula to calculate power
        System.out.printf("Result: %.2f\n", result);
        input.close();

    }
}
