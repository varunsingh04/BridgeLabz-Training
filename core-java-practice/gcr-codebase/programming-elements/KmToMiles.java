import java.util.*; //importing the java package for using Scanner class


//Create a class to convert kilometers to miles
public class KmToMiles {
    public static void main(String[] args) {
        //Using Scanner class to take input from user
        Scanner input = new Scanner(System.in);

        //Declare a variable to store kilometers
        double km = input.nextDouble();
        
        //Declare a variable to calculate miles
        double miles = km / 1.6;

        //Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close(); //closing the scanner object
    }
}
