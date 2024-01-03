public class IsArraySorted {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr1 = {2,1,4,3,5};

        System.out.println(isSorted(arr.length, arr));
        System.out.println(isSorted(arr1.length, arr1));
    }
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int sorted = 1;
        for(int i =0; i < n-1; i++){
            if(a[i] > a[i+1]){
                sorted = 0;
                break;
            }
        }
        return sorted;
    }
}
