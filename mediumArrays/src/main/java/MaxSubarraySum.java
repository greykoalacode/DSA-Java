package main.java;

import java.util.Arrays;
import java.util.List;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int subArraySum = findMaxSubarraySum(nums);
        System.out.println(subArraySum);
        System.out.println(findMaxSubarraySumPrefix(nums));
    }

    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int sum = arr.get(0);
        int ans = Integer.MIN_VALUE;
        for(int i=1; i<arr.size(); i++){
            sum += arr.get(i);
            ans = Math.max(ans, sum);
            sum = arr.get(i);
        }
        return ans;
    }

    public static int findMaxSubarraySumPrefix(int[] nums){
        int max_sum =0;
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i< n; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int i=0; i<n; i++){
            int subsum = 0;
            for(int j=i; j < n; j++){
                subsum = i > 0 ? prefix[j]-prefix[i-1] : prefix[j];
                max_sum = Math.max(max_sum, subsum);
            }
        }
        return max_sum;
    }

    public static int findMaxSubarraySum(int[] nums) {
        int[] range = {0, 0};
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
                range[1] = i;
            }
            if (sum < 0) {
                sum = 0;
                range[0] = i+1;
            }
        }
        return max;
    }
}
