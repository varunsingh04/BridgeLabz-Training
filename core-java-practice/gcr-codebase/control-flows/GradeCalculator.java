
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        //Take input from the user
        Scanner input = new Scanner(System.in);
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int math = input.nextInt();

        //Calculate total 
        int total = physics + chemistry + math;

        //Calculate average
        double percentage = total / 3.0;


        System.out.println("Average: " + percentage);

        //Grade calculation using if-else statements
        if (percentage >= 80)
            System.out.println("Grade: A");

        else if (percentage >= 70)
            System.out.println("Grade: B");

        else if (percentage >= 60)
            System.out.println("Grade: C");

        else if (percentage >= 50)
            System.out.println("Grade: D");

        else if (percentage >= 40)
            System.out.println("Grade: E");

        else
            System.out.println("Grade: R");

        input.close();

    }
}
