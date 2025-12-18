import java.util.*; //importing the java package for using Scanner class

//Create a class to calculate fee discount based on user input
public class FeeDiscountUserInput {
    public static void main(String[] args) {
        //Using Scanner class to take input from user
        Scanner input = new Scanner(System.in);

        //Declare variable to store fee
        int fee = input.nextInt();

        //Declare a variable to store discount percent
        int discountPercent = input.nextInt();
        
        //Declare a variable to calculate discount amount 
        int discount = (fee * discountPercent) / 100;

        //Declare a variable to calculate final fee after discount
        int finalFee = fee - discount;

        //Display the result
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);

        input.close(); //closing the scanner object
    }
}
