package Arrays;
import java.util.*;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //initialization of Array
        double[] heights = new double[11];
        double sum = 0;
        
        
        //User input 
        System.out.println("Enter height of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11; //Calculating Mean
        System.out.printf("Mean height: %.2f\n", mean);
    }
}
