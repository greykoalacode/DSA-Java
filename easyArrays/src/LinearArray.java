public class LinearArray {
    public static int searchInSorted(int[] arr, int N, int K) {
        for(int i=0; i< N; i++){
            if(arr[i] == K){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 9;
        int k1 = 2;
        int n = arr.length;
        System.out.println(searchInSorted(arr, n, k));
        System.out.println(searchInSorted(arr, n, k1));
    }

}
