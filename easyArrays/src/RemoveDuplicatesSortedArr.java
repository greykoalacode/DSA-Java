import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicatesSortedArr {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new ArrayList<>(List.of(1,2,2,3,4)), 5));
    }
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int unique = 1;
        for(int i = 1; i < n; i++){
            if(!Objects.equals(arr.get(i), arr.get(i - 1))){
                unique += 1;
            }
        }
        return unique;
    }
}
