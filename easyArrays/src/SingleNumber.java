public class SingleNumber {
    public static void main(String[] args) {
        int[][] inputs = {
                {2,2,1},
                {4,1,2,1,2},
                {1}
        };
        for(int[] input: inputs){
            System.out.println(findSingle(input));
        }
    }
    public static int findSingle(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int xor = nums[0];
        for(int i=1; i < nums.length; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
