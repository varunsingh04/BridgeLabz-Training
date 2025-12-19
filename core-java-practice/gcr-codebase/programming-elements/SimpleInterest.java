import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt(); //user inputs principal amount
        int rate = input.nextInt(); //user inputs rate of interest
        int time = input.nextInt(); //user inputs time in years

        int simpleInterest = (principal * rate * time) / 100; //formula to calculate simple interest

        System.out.println("Simple Interest: " + simpleInterest);

        input.close();

    }
}
