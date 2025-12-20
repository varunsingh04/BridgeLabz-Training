import java.util.*;


public class TheCoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to The Coffee Counter Chronicles! By Ravi ");
        System.out.println("Let's start your coffee adventure.");
        System.out.println("Please Choose your coffee type: \n1. Espresso \n2. Latte \n3. Cappuccino\n4. Mocha \n5. Type Exit to Leave");


        String userInput = input.next();
            if (userInput.equalsIgnoreCase("Exit")) {
                System.out.println("Thank you for visiting The Coffee Counter Chronicles! Have a great day!");
                return;
            }


        int quantity = 0;
        int Price = 0;
        int totalPrice = 0; 
        
       

        while (userInput != "Exit") {
           switch(userInput){
                case "1":
                    System.out.println("How many coups would you like to order? Price is 129/- per cup.");
                    quantity = input.nextInt();
                    Price = 129 * quantity;
                    System.out.println("You have chosen Espresso.");
                    totalPrice = Price + (Price * 5)/100;
                    System.out.println("Thank you for your order. The total price is: " + totalPrice + "/- including GST");
                    break;
                case "2":
                    System.out.println("How many coups would you like to order? Price is 120/- per cup.");
                    quantity = input.nextInt();
                    Price = 130 * quantity;
                    System.out.println("You have chosen Latte. ");
                    totalPrice = Price + (Price * 5)/100;
                    System.out.println("Thank you for your order. The total price is: " + totalPrice + "/- including GST" );
                    break;
                case "3":
                    System.out.println("How many coups would you like to order? Price is 130/- per cup.");
                    quantity = input.nextInt();
                    Price = 130 * quantity;
                    System.out.println("You have chosen Cappuccino. ");
                    totalPrice = Price + (Price * 5)/100;
                    System.out.println("Thank you for your order. The total price is: " + totalPrice + "/- including GST");
                    break;
                case "4":
                    System.out.println("How many coups would you like to order? Price is 150/- per cup.");
                    quantity = input.nextInt();
                    Price = 150 * quantity;
                    System.out.println("You have chosen Mocha.");
                    totalPrice = Price + (Price * 5)/100;
                    System.out.println("Thank you for your order. The total price is: " + totalPrice + "/- including GST" );
                    break;
                default:
                    System.out.println("Invalid coffee type selected. Please try again.");
                    break;
                
            }

            System.out.println("\nNext Coustomer----\n");
            System.out.println("Welcome to The Coffee Counter Chronicles! By Ravi");
            System.out.println("Let's start your coffee adventure.");
            System.out.println("Please Choose your coffee type: \n1. Espresso \n2. Latte \n3. Cappuccino\n4. Mocha \n5. Type Exit to Leave");

            
            userInput = input.next();
            
            if (userInput.equalsIgnoreCase("Exit")) {
                System.out.println("Thank you for visiting The Coffee Counter Chronicles! Have a great day!");
                break;
            }

            

        }

        


    }
}
