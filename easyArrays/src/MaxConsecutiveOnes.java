public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveBetter(int[] nums){
        int max = 0;
        int curr = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                curr += 1;
            } else {
                max = Math.max(max, curr);
                curr = 0;
            }
        }
        max = Math.max(max, curr);
        return max;
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int consec = 0;
        int max_consec = 0;
        consec += nums[0]== 1? 1: 0;
        for(int i=1; i< nums.length; i++){
            if(nums[i-1] == 1 && nums[i] == 1){
                consec += 1;
            } else if (nums[i] == 1){
                consec = 1;
            } else {
                max_consec = Math.max(max_consec, consec);
                consec = 0;
            }
        }
        return Math.max(max_consec, consec);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println(findMaxConsecutiveBetter(nums));
    }
}
