package Arrays;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Users Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] freq = new int[10]; //Initialization of Array

        
        //Logic loop
        while (number > 0) {
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }
        
        
        //Displaying the result
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println("Digit " + i + ": " + freq[i] + " times");
        }
    }
}
