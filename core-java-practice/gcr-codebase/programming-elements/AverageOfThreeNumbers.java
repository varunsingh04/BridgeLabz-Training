import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(); //user inputs first number
        int num2 = input.nextInt(); //user inputs second number
        int num3 = input.nextInt(); //user inputs third number

        double average = (num1 + num2 + num3) / 3.0; //formula to calculate average of three numbers

        System.out.println("Average of Three Numbers: " + average);

        input.close();

    }
}
