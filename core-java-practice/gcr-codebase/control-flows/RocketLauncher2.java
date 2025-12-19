import java.util.Scanner;

public class RocketLauncher2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt(); //user input counter

        //control flow in for loop to print counter and decrease counter by 1 until it reaches 0 then print Rocket Launched
        for(; counter >= 1; counter--){
            System.out.println("Counter : " + counter);
            if(counter == 1){
                System.out.println("Rocket Launched");
            }
        }

        input.close();
    }
}
