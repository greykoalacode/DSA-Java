package arrays;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums1 = {1, 1, 1, 1};
        int[] nums2 = {1, 2, 3};
        System.out.println(numIdenticalPairsBetter(nums));
        System.out.println(numIdenticalPairsBetter(nums1));
        System.out.println(numIdenticalPairsBetter(nums2));
    }

    // Better Solution
    public static int numIdenticalPairsBetter(int[] nums) {
        int[] freq = new int[100];
        for(int i: nums){
            freq[i-1]++;
        }
        int numOfPairs = 0;
        for(int i: freq){
            numOfPairs += ((i - 1) * (i)) / 2;
        }
        return numOfPairs;
    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        int numOfPairs = 0;
        for (int i : freq.keySet()) {
            int currentFreq = freq.get(i);
            numOfPairs += ((currentFreq - 1) * (currentFreq)) / 2;
        }
        return numOfPairs;
    }
}
