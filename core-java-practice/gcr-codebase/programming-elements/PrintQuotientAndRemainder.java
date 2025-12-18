import java.util.Scanner;//importing the Scanner class

//Create a class to print quotient and remainder of two numbers
public class PrintQuotientAndRemainder{
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Declare a variable to store number1 
        int number1 = input.nextInt();
        //Declare a variable to store number2
        int number2 = input.nextInt();

        //Declare a varaible to calculate quotient 
        int quotient = number1 / number2;
        //Declare a varaible to calculate remainder
        int remainder = number1 % number2;

        //Display the result
        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);
        input.close();//closing the scanner object
    }
}