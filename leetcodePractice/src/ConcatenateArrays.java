import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {3,2,4};
        System.out.println(Arrays.toString(getConcatenation(nums1)));
        System.out.println(Arrays.toString(getConcatenation(nums2)));
    }
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] concatNums = new int[len*2];
        for(int i=0; i< nums.length; i++){
            concatNums[i] = nums[i];
            concatNums[len+i] = nums[i];
        }
        return concatNums;
    }
}
