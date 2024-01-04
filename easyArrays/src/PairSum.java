import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1,-2,4,5,1};
        int s = 3;
        System.out.println(pairSum(arr, s));
    }

    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> pairs = new ArrayList<>();
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            System.out.println(arr[i]+" "+arr[j]);
            if(arr[i]+arr[j] < s){
                if(arr[j] <= arr[i]){
                    j--;
                } else {
                    i++;
                }
            }
            else if(arr[i]+arr[j] == s){
                pairs.add(new int[]{arr[i],arr[j]});
                i++;
//                j--;
            }
            else {
                if(arr[i] >= arr[j]){
                    i++;
                } else {
                    j--;
                }
            }
        }
        return pairs;
    }
}
