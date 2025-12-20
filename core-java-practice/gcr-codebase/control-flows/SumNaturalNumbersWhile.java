import java.util.Scanner;
public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        //Take a input from user
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        //Find sum and check n is natural number or not
        if (number> 0) {
            int sum = 0;
            int i = 1;
            while (i <= number) {
                sum = sum + i;
                i++;
            }
            int sumFormula =(number * (number + 1)) / 2;
            System.out.println("using loop: " + sum);
            System.out.println("using formula: " + sumFormula);
        } 
        else {
            System.out.println("Not a natural number");
        }

        input.close();
    }
}