package reviews;

import java.util.*;


public class TicketPriceQuickSort {

    //Quick sort algorithm
    public static void quickSort(double[] prices){
        quickSort(prices, 0, prices.length - 1);
        
    }

    private static void quickSort(double[] prices ,int low, int high ){
        if(low < high){
            int pi = partition(prices, low, high);
            quickSort(prices, low, pi-1);
            quickSort(prices, pi + 1, high);
        }
    }

    private static int partition(double[] prices , int low , int high){
        double pivot = prices[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                swap(prices, i, j);
            }
        }
        swap(prices, i + 1, high);
        return i + 1;
    }

     private static void swap(double[] prices, int i, int j) {
        double temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }




    //Methods for get top 50 expensive and cheapest
    public static double[] getTop50Cheapest(double[] prices){
        double[] sorted = prices.clone(); 
        quickSort(sorted);
        return Arrays.copyOfRange(sorted, 0, Math.min(50, sorted.length)); 
    }

    public static double[] getTop50Expensive(double[] prices){
        double[] sorted = prices.clone();
        quickSort(sorted);
        int start = Math.max(0 , sorted.length - 50);
        return Arrays.copyOfRange(sorted,start,sorted.length);
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of ticket to be sorted");
        int numTickets = input.nextInt();
        
        if (numTickets <= 0) {
            System.out.println("Number of tickets must be positive. Exiting...");
            return;
        }



        double[] ticketPrices = new double[numTickets];
        
     
        System.out.println("Enter the ticket prices ");
        for (int i = 0; i < numTickets; i++) {
            System.out.print("Price " + (i + 1) + ": $");
            ticketPrices[i] = input.nextDouble();
        }

        double[] cheapest = getTop50Cheapest(ticketPrices);
        System.out.println("Top " + cheapest.length + " cheapest tickets:");
        for (int i = 0; i < cheapest.length; i++) {
            System.out.println((i + 1) + ". $" + cheapest[i]);
        }
        
        System.out.println(); //use to give space
        
      
        double[] expensive = getTop50Expensive(ticketPrices);
        System.out.println("Top " + expensive.length + " most expensive tickets:");
        for (int i = 0; i < expensive.length; i++) {
            System.out.println((i + 1) + ". $" + expensive[i]);
        }

        input.close();

        
    }
}
