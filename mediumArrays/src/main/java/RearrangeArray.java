package main.java;

import java.util.Arrays;

public class RearrangeArray {
    public static int[] rearrangeArrayWithSpace(int[] nums) {
        int[] rearrangedArr = new int[nums.length];
        int posIndex= 0;
        int negIndex = 1;
        for(int i=0; i< nums.length; i++) {
            if (nums[i] > 0) {
                rearrangedArr[posIndex] = nums[i];
                posIndex += 2;
            } else {
                rearrangedArr[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return rearrangedArr;
    }
    public static int[] rearrangeArray(int[] nums) {
        int start = 0, end = 1;
        int n = nums.length;

        while (start <= end && end < n) {
            if(nums[start] > 0 && nums[end] < 0){
                if(end-start > 1) {
                    int temp = nums[start+1];
                    nums[start+1] = nums[end];
                    nums[end] = temp;
                    start = end;
                    end = start + 1;
                } else {

                start = end+1;
                end = start+1;
                }
            } else if (nums[start] > 0 && nums[end] > 0){
                end++;
            } else if (nums[start] < 0 && nums[end] < 0) {
                end++;
            } else if (nums[start] < 0 && nums[end] > 0) {
                if(end-start >= 1) {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = nums[start+1];
                    nums[start+1] = temp;
                    start = start+1;
                }
                start = end+1;
                end = start+1;
            }
//            if (nums[start] < 0) {
//                if (nums[end] > 0) {
//                    int temp = nums[start];
//                    nums[start] = nums[end];
//                    nums[end] = temp;
//                    start++;
//                } else {
//                    end++;
//                }
//            } else {
//                if (nums[end] < 0) {
//                    int temp = nums[start];
//                    nums[start] = nums[end];
//                    nums[end] = temp;
//                } else {
//                    end++;
//                }
//            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {3, 1, -2, -5, 2, -4},
                {-1, 1}
        };
        for (int[] nums : inputs) {
            System.out.println(Arrays.toString(rearrangeArray(nums)));
//            System.out.println(Arrays.toString(rearrangeArrayWithSpace(nums)));
        }
    }
}
