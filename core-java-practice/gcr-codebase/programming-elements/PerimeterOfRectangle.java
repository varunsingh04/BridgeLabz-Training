import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt(); //user inputs length
        int breadth = input.nextInt(); //user inputs breadth

        int perimeter = 2 * (length + breadth); //formula to calculate perimeter of rectangle

        System.out.println("Perimeter of Rectangle: " + perimeter);

        input.close();

    }
}
