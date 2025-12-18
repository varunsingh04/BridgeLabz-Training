import java.util.Scanner;//importing the Scanner class

//Create a class to calculate the total purchase price
public class TotalPurchasePrice {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Declare a variable to store unit price 
        int unitPrice = input.nextInt();

        //Declare a variable to store quantity
        int quantity = input.nextInt();

        //Declare a variable to calculate total price
        int totalPrice = unitPrice * quantity;

        //Display the result
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);
                
        input.close();//closing the scanner object
    }
}
