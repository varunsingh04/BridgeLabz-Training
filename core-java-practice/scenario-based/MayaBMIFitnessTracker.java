import java.util.*;


public class MayaBMIFitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Height in Meters : ");
        double clientHeight = input.nextDouble();

        System.out.print("Please Enter Your Weight in KG : ");
        double clientWeight = input.nextDouble();  

        double bmi = clientWeight / (clientHeight * clientHeight);
        System.out.println("BMI: " + bmi);

        // Determine BMI category 
        if (bmi <= 18.4)
            System.out.println("Underweight");

        else if (bmi <= 24.9)
            System.out.println("Normal");
        
        else if (bmi < 39.9)
            System.out.println("Overweight");
        
        input.close();

    }
}
