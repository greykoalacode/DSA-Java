package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithSum {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int count = 0;
        preSumMap.put(0,1);
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            if (preSumMap.containsKey(sum - k)) {
                count += preSumMap.get(sum-k);
            }
            preSumMap.put(sum, preSumMap.getOrDefault(sum, 0)+1);
            System.out.println("keys: "+preSumMap.keySet());
            System.out.println("values: "+preSumMap.values());
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {1, 1, 1},
                {1, 2, 3},
                {0,0,0,0,0,0,0,0,0,0}
        };
        int[] targets = {2, 3, 0};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println(subarraySum(inputs[i], targets[i]));
        }
    }
}
