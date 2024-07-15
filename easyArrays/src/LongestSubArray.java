import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {

    public static int findLongestSubarrayPositives(int[] A, int N, int K){
        int length = 0;
        int start = 0, end = 0;
        int[] prefix = new int[N];
        prefix[0] = A[0];
        for(int i=1; i< N; i++){
            prefix[i] = prefix[i-1]+A[i];
        }
        while (start <= end && end < N) {
            int curr = start == 0 ? prefix[start] : prefix[start]-prefix[start-1];
            int rangeSum = start == 0 ? prefix[end]: prefix[end] - prefix[start-1];
            if(curr == K){
                length = Math.max(length, 1);
                end++;
            } else if(rangeSum > K){
                start++;
            } else if(rangeSum <K){
                end++;
            } else {
                length = Math.max(length, (end-start+1));
                end++;
            }
        }
        return length;
    }
    public static int findLongestSubarray(int[] A, int N,  int K){

        Map<Integer, Integer> prefixSum = new HashMap<>();
        int length = 0;
        int sum = 0;
        for(int i=0; i< N; i++){
            sum += A[i];
            if(sum == K) {
                length = Math.max(length, i+1);
            }
            if(prefixSum.containsKey(sum-K)){
                int start = prefixSum.get(sum-K);
                length = Math.max(length, i-start);
            }
            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum, i);
            }
        }
//
        return length;
    }
    public static void main(String[] args) {
        int[][] inputs = {
                {10, 0, 5, 2, 7, 1,0, 9},
                {-1, 2, 3}
        };
        for(int[] input: inputs){
            System.out.println(findLongestSubarray(input, input.length, 15));
            System.out.println(findLongestSubarrayPositives(input, input.length, 15));
        }
    }
}
