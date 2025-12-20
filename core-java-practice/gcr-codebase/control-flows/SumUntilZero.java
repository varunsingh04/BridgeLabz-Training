import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double total = 0.0; // Take input from the user
        double num;

        // Sum numbers until zero is entered
        while (true) {
            num = input.nextDouble();
            if (num == 0)
                break;
            total += num;
        }
        System.out.println(total);
        
        input.close();
    }
}