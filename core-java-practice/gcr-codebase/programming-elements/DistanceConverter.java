//Declare a class for converting Kilometers to Miles 
public class DistanceConverter {
    public static void main(String[] args) {
        //Declare a variable to store the distance in kilometers
        double kilometers = 10.8;

        //Declare a variable to store the conversion factor from kilometers to miles i.e 1km = 1.6 miles
        double conversionFactor = 1.6;

        //Convert the distance from kilometers to miles
        double miles = kilometers * conversionFactor;

        //Display the distance in miles
        System.out.println("The distance " + kilometers + "km in miles is " + miles);
    }
    
}
