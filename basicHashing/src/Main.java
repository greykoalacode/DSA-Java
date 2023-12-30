import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static int[] countFrequency(int n, int x, int[] nums){
        // Write your code here.
        int[] freq = new int[n];
        for(int i: nums){
            if(i <= n) freq[i-1] += 1;
        }
        return freq;

    }
}