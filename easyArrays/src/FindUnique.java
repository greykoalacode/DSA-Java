import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3 ,1, 6, 3 ,6, 2};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr){
        //Your code goes here
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int i:arr){
            if(!freqMap.containsKey(i)){
                freqMap.put(i, 1);
            } else {
                freqMap.remove(i);
            }
        }
        return (int)freqMap.keySet().toArray()[0];
    }
}
