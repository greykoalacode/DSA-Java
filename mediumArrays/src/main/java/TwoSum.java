package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        System.out.println(Arrays.toString(twoSumAlt(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSumAlt(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
        System.out.println(Arrays.toString(twoSumAlt(nums3, target3)));
        System.out.println(Arrays.toString(twoSum(nums4, target4)));
        System.out.println(Arrays.toString(twoSumAlt(nums4, target4)));
    }

    // Problem in approach: if array is sorted then its original positions are missed
    // hence result won't be correct.
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = {0,nums.length-1};
        if(nums.length == 2) {
            return nums[0] + nums[1] == target ? indices : null;
        }
        Arrays.sort(nums);
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
//            System.out.println("Each case "+indices[0]+" "+indices[1]);
        }
        return null;
    }
    public static int[] twoSumAlt(int[] nums, int target) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int[] indices = {0,1};
        if(nums.length == 2){
            return nums[0]+nums[1] == target ? indices : null;
        }

        for (int i=0; i < nums.length; i++) {
            int curr = nums[i];
            int req = target-nums[i];
            if (freqMap.containsKey(req)) {
                int reqIndex = freqMap.get(req);
                return reqIndex < i ? new int[]{reqIndex, i} : new int[]{i, reqIndex};
            } else {
                freqMap.put(curr, i);
            }
        }

//        int cs = 0;
//        while(0 <= indices[0] && indices[0] < indices[1] && indices[1] < nums.length){
//            int left = nums[indices[0]];
//            int right = nums[indices[1]];
//            cs = left+right;
//            if(cs == target){
//                return indices;
//            } else if (cs < target){
//                if(indices[1] != nums.length-1)
//                    indices[1]++;
//                else
//                    indices[0]++;
//            } else {
//                if(indices[0] != 0)
//                    indices[0]--;
//                else
//                    indices[1]--;
//            }
//            System.out.println("Each case "+indices[0]+" "+indices[1]);
//        }
        return null;
    }
}
