package org.example;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    // Time complexity - O(n)+O(n)
    // Space complexity - O(n) at max since there should be less than n elements
    // acc to Majority element expectation
    public static int findMajorityElementInitial(int[] nums){
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int n: nums){
            freqMap.put(n, freqMap.getOrDefault(n,0)+1);
        }
        for(int element: freqMap.keySet()){
            if(freqMap.get(element) > nums.length/2){
                return element;
            }
        }
        return -1;
    }

    public static int findMajorityElementBetter(int[] nums){
        int count = 0;
        int element = 0;

        for(int i=0; i<nums.length; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if(nums[i] == element)
                count++;
            else
                count -= 1;
            System.out.println(nums[i]+" "+element+" "+count);
        }
        int count1 = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == element)
                count1++;
        }
        if(count1 > (nums.length/2)) return element;
        return -1;
    }

    public static void main(String[] args) {
        int[][] inputs = {{3,2,3}, {2,2,1,1,1,2,2},{5,1,5,2,5,3,5,5}};
//        int xor = 5^1^5^1^5^3^5^5;

        for(int[] arr: inputs){
            System.out.println(findMajorityElementInitial(arr));
            System.out.println(findMajorityElementBetter(arr));
        }
    }
}
