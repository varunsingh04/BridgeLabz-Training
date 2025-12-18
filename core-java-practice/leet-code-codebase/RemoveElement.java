import java.util.ArrayList;


//Define a class named RemoveElement
public class RemoveElement {
    public static void main(String[] args) {
       
        int[] nums = {3,2,2,3}; //input array
        int val = 3; //value to be removed
        int k = removeElement(nums, val); //calling removeElement method and storing new length
        System.out.println("New length: " + k); //displaying new length
        System.out.print("Modified array: "); //displaying modified array
        
        //Printing modified array up to new length k
        for(int i = 0 ; i < k ; i++){
            System.out.print(nums[i] + " "); //printing elements up to new length
        }
    }

    //Declare a method to remove all instances of val in nums array
    public static int removeElement(int[] nums, int val) {

        //Using ArrayList to store elements not equal to val
       ArrayList<Integer> arr = new ArrayList<>();
       for(int num : nums){ 
           if(num != val){ //checking if current element is not equal to val
               arr.add(num); //adding element to ArrayList

           }
       }

       //Copying elements from ArrayList back to nums array
       for(int i = 0 ; i < arr.size(); i++){
           nums[i] = arr.get(i); //setting element at index i in nums to element at index i in arr

       }
       return arr.size(); //returning new length of modified array
    }
}
