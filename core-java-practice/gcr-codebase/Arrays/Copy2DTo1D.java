package Arrays;

import java.util.Scanner;


public class Copy2DTo1D {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Users Inputs
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols]; //Declaration of 2D matrix
        
        System.out.println("Enter elements:"); //User input inmatrix
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = input.nextInt();

        int[] array = new int[rows * cols]; //Declaration of 1D matrix
        
        
        //logic of Copying 2D in 1D
        int index = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                array[index++] = matrix[i][j];
        
        
        //Displaying the result
        System.out.println("1D Array:");
        for (int val : array)
            System.out.print(val + " ");
    }
}
