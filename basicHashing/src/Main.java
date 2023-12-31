import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(Arrays.toString(getFrequencies(new int[]{1, 1, 3, 1, 2})));
    }

    public static int[] countFrequency(int n, int x, int[] nums){
        // Write your code here.
        int[] freq = new int[n];
        for(int i: nums){
            if(i <= n) freq[i-1] += 1;
        }
        return freq;

    }

    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i: v){
            int currentValue = freq.containsKey(i) ? freq.get(i)+1 : 1;
            freq.put(i, currentValue);
        }

        int[] minmax =  {v[0], v[0]};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: freq.keySet()){
            if(max <= freq.get(i)){
                if(max == freq.get(i)){
                    minmax[0] = Math.min(minmax[0], i);
                }
                max = freq.get(i);
                minmax[0] = i;
            }
            else if(min >= freq.get(i)){
                if(freq.get(minmax[1]) == freq.get(i)){
                    minmax[1] = Math.min(minmax[1], i);
                }
                min = freq.get(i);
                minmax[1] = i;
            }
        }
        return minmax;
    }
}