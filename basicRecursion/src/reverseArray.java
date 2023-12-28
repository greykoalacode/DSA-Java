import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(5, nums)));
    }

    public static int[] reverseArray(int n, int[] nums) {
        if(n == nums.length/2) return nums;
        int temp = nums[nums.length-n];
        nums[nums.length-n] = nums[n-1];
        nums[n-1] = temp;
        return reverseArray(n-1, nums);
    }
}
