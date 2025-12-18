import java.util.Scanner;//importing the Scanner class

//Create a class to calculate the length of the side of a square given its perimeter
public class SquareSide {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Declare a variable to store perimeter
        int perimeter = input.nextInt();

        //Validate if perimeter is less than 4
        if(perimeter == 0 || perimeter < 4){
            System.out.println("Perimeter should be greater than or equal to 4");
            input.close();
            return;
            
        }

        //Declare a variable to calculate side using perimeter/4 formula
        int side = perimeter / 4;

        //Display the result
        System.out.println("The length of the side is " +
                side + " whose perimeter is " + perimeter);
        
        input.close();//closing the scanner object
    }
}
