import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); //user inputs

        //Control flow to check if number is positive, negative or zero
        if(number > 0){
            System.out.println("positive");
        } else if(number < 0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        input.close();
    }
}
