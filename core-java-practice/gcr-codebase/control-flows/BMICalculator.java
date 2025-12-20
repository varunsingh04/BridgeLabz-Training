import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        // Take input from the user
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double height = input.nextDouble() / 100.0;

        // BMI calculation logic
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        // Determine BMI category 
        if (bmi <= 18.4)
            System.out.println("Underweight");

        else if (bmi <= 24.9)
            System.out.println("Normal");
        
        else if (bmi < 39.9)
            System.out.println("Overweight");
        
        else
            System.out.println("Obese");

        input.close();
    }
}