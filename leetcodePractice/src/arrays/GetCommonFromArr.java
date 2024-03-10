package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetCommonFromArr {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {2,4};
        System.out.println(getCommon(nums1, nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int minCommon = Integer.MAX_VALUE;
        for (int k : nums1) {
            if (!freqMap.containsKey(k)) {
                freqMap.put(k, 1);
            } else {
                freqMap.put(k, freqMap.get(k) + 1);
            }
        }
        for (int i : nums2) {
            if (freqMap.containsKey(i)) {
                minCommon = Math.min(i, minCommon);
            }
        }
        if(minCommon == Integer.MAX_VALUE){
            return -1;
        }
        return minCommon;
    }
}
