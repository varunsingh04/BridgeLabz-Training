//Declare a class to calculate profit and loss percentage
public class ProfitLossCalculator {
    public static void main(String[] args) {
        //Declare a variable to store cost price
        int costPrice = 129;
        //Declare a variable to store selling price
        int sellingPrice = 191;

        //Declare a variable to store profit
        int profit = sellingPrice - costPrice;

        //Calculate profit percentage
        double profitPercentage = (profit * 100) / costPrice ;

        //Display the cost price, selling price, profit and profit percentage
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice  + "\n" 
                            + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%" 
        );
        
    }
}
