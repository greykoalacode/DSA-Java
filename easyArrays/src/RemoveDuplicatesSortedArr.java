import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicatesSortedArr {
    public static void main(String[] args) {
//        System.out.println(removeDuplicates(new ArrayList<>(List.of(1,2,2,3,4)), 5));
        int[] arr = {1,1,2};
        System.out.println(removeDuplicatesLC(arr));
        for (int j : arr) {
            System.out.println(j);
        }

    }
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int unique = 1;
        for(int i = 1; i < n; i++){
            if(!Objects.equals(arr.get(i), arr.get(i - 1))){
                unique += 1;
            }
        }
        arr.toArray(Integer[]::new);
        return unique;
    }

    public static int removeDuplicatesLC(int[] nums) {
        int unique = 1;
        int[] uniqueNum = new int[nums.length];
        uniqueNum[0] = nums[0];
        int index = 1;
        for(int i=1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                unique++;

                uniqueNum[index] = nums[i];
                index++;

            }
        }
        nums = uniqueNum.clone();
        return unique;
    }
}
