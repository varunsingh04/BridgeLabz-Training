import java.util.Scanner;//importing the Scanner class


//Create a class to perform double operations
public class DoubleOperation {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Declare variables to store three double values
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //perform operations to understand operator precedence
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;


        //Display the result
        System.out.println("The results of Double Operations are "
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();//closing the scanner object
    }
}
