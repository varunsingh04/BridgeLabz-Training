
import java.util.Scanner;
public class SumNaturalNumberUsingFor  {
    public static void main(String[] args) {
        //Take a input from user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        //Find sum using for loop and check n is natural number or not
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            int formulaSum = (number * (number + 1)) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
