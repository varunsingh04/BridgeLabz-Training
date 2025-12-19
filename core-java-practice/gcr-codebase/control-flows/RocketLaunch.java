import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt(); //user input counter


        //Control flow in while loop to print counter and decrease counter by 1 until it reaches 0 then print Rocket Launched
        while(counter >= 1){
            System.out.println("Counter : " + counter);
            counter--;
            if(counter == 0){
                System.out.println("Rocket Launched");
            }
        }

        input.close();
    }
}
