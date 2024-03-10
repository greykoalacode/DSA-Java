package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int[] intersect = new int[];
        for (int k : nums1) {
            if (!freqMap.containsKey(k)) {
                freqMap.put(k, 1);
            } else {
                freqMap.put(k, 1);
            }
        }
        int index = 0;
        for(int j: nums2){
            if(freqMap.containsKey(j)){
                intersect[index++] = j;
            }
        }
        return intersect;
    }
}
