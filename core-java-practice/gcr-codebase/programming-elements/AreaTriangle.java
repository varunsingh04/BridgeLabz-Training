import java.util.Scanner;//importing the Scanner class
//Create a class to calculate the area of a triangle
public class AreaTriangle {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Declare a variable to store base 
        double base = input.nextDouble();

        //Declare a variable to store height
        double height = input.nextDouble();

        //Declare variable to store area of triangle in cm using 1/2(0.5) * base * height formula
        double areaInSquareCM = 0.5 * base * height;

        //Decalre variable to store area of triangle in inches by converting cm to inches (1 inch = 2.54 cm)
        double areaInSquareInches = areaInSquareCM / (2.54 * 2.54);

        //Display the result
        System.out.println("The area of triangle in sq in is " +
                areaInSquareInches + " and sq cm is " + areaInSquareCM);

        input.close();//closing the scanner object

    }
}


