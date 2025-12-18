import java.util.Scanner;//importing the Scanner class

//Create a class to perform basic arithmetic operations
public class BasicCalculator {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in); 

        //Declare a variable to store number1
        float number1 = input.nextFloat();

        //Declare a variable to store number2
        float number2 = input.nextFloat();


        //Declare variable to store result of addition
        float addition = number1 + number2;

        //Declare variable to store result of subtraction
        float subtraction = number1 - number2;

        //Declare variable to store result of multiplication
         float multiplication = number1 * number2;

        //Declare variable to store result of division
        float division = number1 / number2;

        //Display the result
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", " + multiplication+ ", and " + division);

        input.close();
    }

    
}
