import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt(); // user input

        //For loop to print multiplication table from 1 to 5
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();

    }
}