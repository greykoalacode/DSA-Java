import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = Stream.of(1, 2, 3, 1, 4).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(findDuplicate(arr, 5));
    }

    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i < n; i++){
            if (!freqMap.containsKey(arr.get(i))){
                freqMap.put(arr.get(i), 1);
            }
            else {
                return arr.get(i);
            }
        }
        return -1;
    }
}
