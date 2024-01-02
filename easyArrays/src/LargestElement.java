public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2,3,23,9};
        int n = arr.length;
        System.out.println(largestElement(arr, n));
    }
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            max = Math.max(i, max);
        }
        return max;
    }
}
