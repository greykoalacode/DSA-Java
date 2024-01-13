import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PosSortedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(0,0,1,1,2,2,2,2));
        System.out.println(Arrays.toString(firstAndLastPosition(arr, arr.size(), 2)));
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int[] firstLast = {-1, -1};

        for(int i=0; i< n; i++){
            if(arr.get(i) == k){
                if(firstLast[0] == -1){
                    firstLast[0] = i;
                    firstLast[1] = i;
                } else {
                    firstLast[1] = i;
                }
            }
        }
        return firstLast;
    }

}
