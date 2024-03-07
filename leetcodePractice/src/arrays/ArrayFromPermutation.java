package arrays;

import java.util.Arrays;

public class ArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] nums1 = {5,0,1,2,3,4};
        System.out.println(buildArray(nums));
        System.out.println(buildArray(nums1));
    }

    public static String buildArray(int[] nums) {
        // naive solution
        int[] updatedArray = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            updatedArray[i] = nums[nums[i]];
        }
//        for(int i = 0;  i < nums.length; i++){
//            if(i != nums[i]){
//                int temp = nums[i];
//                nums[i] = nums[temp];
//                nums[temp] = temp;
//            }
//        }
//        int lastNum = nums[nums.length-1];
//        for(int i = nums.length-1; i > 0; i--){
//            nums[i] = nums[i-1];
//        }
//        nums[0] = lastNum;
        return Arrays.toString(nums);
    }
}
