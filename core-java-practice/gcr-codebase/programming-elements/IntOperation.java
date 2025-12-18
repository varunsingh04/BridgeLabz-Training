import java.util.Scanner;//importing the Scanner class

//Create a class to perform integer arithmetic operations
public class IntOperation {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Declare variables to store three integers
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //perform operations to understand operator precedence
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        //Display the result
        System.out.println("The results of Int Operations are "
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        input.close();//closing the scanner object            
    }

}
