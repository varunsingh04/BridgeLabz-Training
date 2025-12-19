import java.util.Scanner;

public class DivisibleByFIve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); //user inputs a number

        //Control flow to check divisibility by 5
        if(number % 5 == 0){
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

        input.close();
    }
}
