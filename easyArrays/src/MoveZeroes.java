public class MoveZeroes {
    public static void moveZeroes(int[] arr){
        int zeroCount = 0;
        int n = arr.length;
        int index = 0;
        for (int j : arr) {
            if (j == 0) {
                zeroCount++;
            } else {
                arr[index++] = j;
            }
        }
        for(int i=n-zeroCount; i < n; i++){
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int i: nums){
            System.out.println(i);
        }
        System.gc();
        double duration = (double) (System.nanoTime() - start) /100_000_000;
        System.out.println(String.format("Execution: %.4fs",duration));
    }
}
