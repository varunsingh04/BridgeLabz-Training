import java.util.*; //importing the Scanner class

//Create a class to convert height from centimeters to feet and inches
public class HeightConversion {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Declare a variable to store height in centimeters
        int heightInCM = input.nextInt();
        
        //Declare a variable to store height in inches
        double inches = heightInCM / 2.54;
        //Declare a variable to store height in feet 
        int feet = (int) inches / 12;

        //Display the result
        System.out.println("Your Height in cm is " + heightInCM +
                " while in feet is " + feet +
                " and inches is " + inches);

        input.close();
    }
}
