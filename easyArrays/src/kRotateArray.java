public class kRotateArray {

    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArray(int[] nums, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n-1);
        reverse(nums, 0, n-1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
//        rotate(nums, nums.length, k);
        rotateArray(nums, nums.length, k);
        for (int i : nums
        ) {
            System.out.println(i);
        }
    }

    public static void rotate(int[] nums, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = nums[i];
        }
        for (int j = n - k - 1; j >= 0; j--) {
            nums[j + k] = nums[j];
        }
        for (int l = 0; l < k; l++) {
            nums[l] = temp[l];
        }

    }
}
