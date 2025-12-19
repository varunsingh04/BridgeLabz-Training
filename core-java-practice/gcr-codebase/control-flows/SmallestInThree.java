import java.util.Scanner;


public class SmallestInThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();//User inputs first number
        int number2 = input.nextInt();//User inputs second number
        int number3 = input.nextInt();//User inputs third number

        

        //Control flow to find the first number is smallest?
        if(number1 < number2 && number1 < number3){
            System.out.println("Is the first number the smallest? Yes");
        }else{
            System.out.println("Is the first number the smallest? No");
        }

        input.close();


    }
}
