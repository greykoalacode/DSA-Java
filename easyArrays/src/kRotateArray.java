public class kRotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        for (int i:nums
             ) {
            System.out.println(i);
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int rotations = k % n;
        int next = nums[n-1];
        int index = n-rotations;
        int[] nums1 = new int[n];
        for(int i=0; i<index-1; i++){
            nums1[i] = nums[index+i];
        }
        for(int j = index-1; j < n; j++){
            nums1[j]= nums[j-k];
        }
        System.arraycopy(nums1, 0, nums, 0, n);
    }
}
