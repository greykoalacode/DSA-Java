import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] inputArr = {41, 467, 334, 500, 169, 724, 478, 358, 962, 464};
        System.out.println(Arrays.toString(inputArr));
        System.out.println(Arrays.toString(insertionSort(inputArr)));
//        System.out.println(Arrays.toString(selectionSortImpl(inputArr)));
//        System.out.println(Arrays.toString(bubbleSortImpl(inputArr)));
    }

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            arr[prev + 1] = current;
        }
        return arr;
    }

    public static int[] selectionSortImpl(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp =  arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

    public static int[] bubbleSortImpl(int[] arr){
        int len = arr.length;
        for(int i = len-1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

            }
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }
}