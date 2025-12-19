import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();

        //Control flow to check if the given date falls in spring season (March 20 to June 20)
        if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("The date " + day + "/" + month + " falls in the spring season.");
        } else {
            System.out.println("The date " + day + "/" + month + " does not fall in the spring season.");
        }

        input.close();
    }
}
