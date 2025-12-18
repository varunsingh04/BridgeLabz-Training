//Create a class to calculate the discount on fess and final fess after discount
public class FeeDiscount {
    public static void main(String[] args) {
        //Declare a variable to store the total fees
        int fees = 125000;

        //Declare a variable to store the discount percent 
        int discountPercent = 10;

        //Declare a variable to calculate the discount amount 
        int discount = (fees * discountPercent) / 100;

        //Declare a variable to calculate the final fees after discount
        int finalFees = fees - discount;

        //Display the result
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFees);
    }
}
