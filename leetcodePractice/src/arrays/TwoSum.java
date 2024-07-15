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
        int[] nums4 = {2,5,5,11};
        int target4 = 10;

        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
        System.out.println(Arrays.toString(twoSum(nums4, target4)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = {0,nums.length-1};
        if(nums.length == 2){
            return nums[0]+nums[1] == target ? indices : null;
        }
        int cs = 0;
        while(indices[0] < indices[1]){
            cs = nums[indices[0]]+nums[indices[1]];
            if(cs == target){
                return indices;
            } else if (cs < target){
                indices[0]++;
            } else {
                indices[1]--;
            }
        }
        return null;
    }
}
