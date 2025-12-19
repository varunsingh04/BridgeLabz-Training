import java.util.Scanner;


public class EnterZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble(); //user inputs number
        double zero = 0.0; //initalizing zero value

        double total = 0.0; //Declare a total variable to store sum of user inputs

        //Control flow to check if users entered number zero if not then add user input until user enters zero
        while(number != zero){
            total += number;
            System.out.println("The current sum is " + total + ". Enter zero to stop.");
            number = input.nextDouble();
            if(number == zero){
                System.out.println("The total sum is " + total);
            }
        }

        input.close();

    }    
}
