package arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] nums3 = {3,3};
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = {0,1};
        while(indices[0] < indices[1] && indices[1] < nums.length){
            int currentSum = nums[indices[0]]+nums[indices[1]];
            if(currentSum == target){
                return indices;
            } else if (currentSum < target){
                indices[1]++;
            } else {
                indices[0]++;
                if((indices[1] - indices[0]) > 1){
                    indices[1]--;
                } else {
                    indices[1]++;
                }
            }
        }
        return null;
    }
}
