package arrays;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        Set<Integer> intersect = new HashSet<>();
        for (int k : nums1) {
            if (!freqMap.containsKey(k)) {
                freqMap.put(k, 1);
            } else {
                freqMap.put(k, 1);
            }
        }
        for(int j: nums2){
            if(freqMap.containsKey(j)){
                intersect.add(j);
            }
        }
        int[] arr =  new int[intersect.size()];
        int index = 0;
        for(int i: intersect){
            arr[index++] = i;
        }

        return arr;
    }
}
