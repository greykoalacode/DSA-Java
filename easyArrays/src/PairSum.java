import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, 5, 1};
        int s = 3;
        pairSumAlt(arr, s).forEach(
                each -> System.out.println(each[0] + " " + each[1])
        );
    }

    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> pairs = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        while (i < j) {
            if (arr[i] + arr[j] < s) {
                if(j < arr.length-1){
                    j++;
                } else {
                    i++;
                }
            } else if (arr[i] + arr[j] == s) {
                pairs.add(new int[]{arr[i], arr[j]});
                i++;
            } else {
                j--;
            }
        }
        return pairs;
    }

    public static List<int[]> pairSumAlt(int[] arr, int s) {
        List<int[]> pairs = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
        for(int j=i+1; j <arr.length; j++){
            if(arr[i]+arr[j] == s){
                int[] pair = {arr[i], arr[j]};
                Arrays.sort(pair);
                pairs.add(pair);
            }
        }
    }
        pairs.sort((p1, p2) -> Objects.compare(p1[0], p2[0], Comparator.naturalOrder()));
        return pairs;

    }
}
