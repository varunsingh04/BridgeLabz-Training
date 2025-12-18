import java.util.Scanner;//importing the Scanner class

//Create a class to convert distance from feet to yard and miles
public class FeetToYard {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        //Declare a variable to store distance in feet
        int distanceInFeet = input.nextInt();

        //Declare a variable to store distance in yard 
        int distanceInYard = distanceInFeet / 3;

        //Declare a variable to store distance in miles
        int distanceInMiles = distanceInYard / 1760;
        

        //Display the result
        System.out.println("The distance in yards is " + distanceInYard +
                " while the distance in miles is " + distanceInMiles);

        input.close();//closing the scanner object        
    }
}
