
import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        // Take input from the user
        Scanner input = new Scanner(System.in);

        //Amar  details
        int age1 = input.nextInt();
        int height1 = input.nextInt();
        
        //Akbar details
        int age2 = input.nextInt();
        int height2 = input.nextInt(); 

        //Amar  details
        int age3 = input.nextInt();
        int height3 = input.nextInt(); 
        
        String youngest="";
        String tallest="";


        // Find tallest
        if (height1 >= height2 && height1 >= height3) {
            tallest = "Amar";
        } 
        else if (height2 >= height3) {
            tallest = "Akbar";
        } 
        else {
            tallest = "Anthony";
        }

        // Find youngest
        if (age1 <= age2 && age1 <= age3) {
            youngest = "Amar";
        } 
        else if (age2 <= age3) {
            youngest = "Akbar";
        } 
        else {
            youngest = "Anthony";
        }

        
        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);

        input.close();
    }
}
