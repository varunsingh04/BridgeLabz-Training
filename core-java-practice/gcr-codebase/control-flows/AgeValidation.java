import java.util.*;


public class AgeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt(); //user inputs age


        //Control flow to check if age is 18 or above to validate voting eligibility
        if( age >= 18 ) {
            System.out.println("The person's age is " + age + " and can vote");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }
        
        input.close();
    }    
}
