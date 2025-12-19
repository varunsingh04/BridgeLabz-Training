import java.util.Scanner;

public class VolumeOfCylinders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();  //user inputs radius
        int height = input.nextInt(); //user inputs height

        double pi =  Math.PI;

        double volume = pi * radius * radius * height; //formula to calculate volume of cylinder

        System.out.printf("Volume of Cylinder: %.2f\n", volume);

        input.close();

    }
}
