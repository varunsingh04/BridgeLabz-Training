

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 1 ; i < nums.length ; i++){
            for(int j = i ; j < nums.length; j++){
                if(nums[j] + nums[j-i] == target){
                   return new int[] {j ,j-i};
                }
            }
        }
        
        return null;
    }
}
