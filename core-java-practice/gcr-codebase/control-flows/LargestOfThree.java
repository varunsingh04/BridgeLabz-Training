import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();//user inputs
        int number2 = input.nextInt();//user inputs
        int number3 = input.nextInt();//user inputs

        //conditional statements to check first number is largest
        if(number1 > number2 && number1 > number3){
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }

        //conditional statements to check second number is largest

        if(number2 > number1 && number2 > number3){
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }

        //conditional statements to check third number is largest

        if(number3 > number1 && number3 > number2){
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }

        input.close();
    }
}
