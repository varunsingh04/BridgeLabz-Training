public class MoveZeros{
    public static void main(String[] args) {
        
        MoveZeros mz = new MoveZeros();
        int[] nums = {0,1,0,3,12};
        mz.MoveZeroes(nums);
        System.out.print("Array after moving zeros: [");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            if(i < nums.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public void MoveZeroes(int[] nums) {
        int n = nums.length;
        int pointerNonZeroElement = 0 ;
        for(int i  = 0; i < n; i++){
            if(nums[i] != 0 ){
                int temp = nums[i];
                nums[i] = nums[pointerNonZeroElement];
                nums[pointerNonZeroElement] = temp;
                pointerNonZeroElement++;
            }
        }

       

    }
}