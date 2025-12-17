

public class RotateArray {
    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        ra.Rotate(nums, k);
        System.out.print("Rotated Array: [");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            if(i < nums.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public void Rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[(i+k) % nums.length] = nums[i];
        }
        for(int i = 0 ; i < nums.length ;i++ ){
            nums[i] = result[i];
        }
    }
}
