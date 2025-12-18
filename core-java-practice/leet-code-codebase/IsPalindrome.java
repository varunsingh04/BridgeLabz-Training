
//Class to check if a number is palindrome or not
public class IsPalindrome {
    public static void main(String[] args) {
        
        //Calling the method and displaying the result
        System.out.println(isPalindrome(121));
    }

    //Declare a method to check if a number is palindrome
    public static boolean isPalindrome(int x) {
        
       
        int sum = 0 ; //variable to store reversed number
        int temp ; //variable to store original value of x
        int rem ; //varaible to store remainder
        
        temp = x; //storing original value of x

        //Reversing the number
        while(x>0){
            rem = x % 10 ; //getting remainder
            sum = (sum*10) + rem; //building the reversed number
            x = x/10; //removing last digit from x

        }

        //Checking if original number and reversed number are same
        if(temp == sum){
            return true; //if number is same then is x is palindrome
        }else {
            return false; //if number is not same then x is not palindrome
        }
        
    }
}
