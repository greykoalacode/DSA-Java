package arrays;

import java.util.Arrays;

public class DuplicateZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr1 = {1, 2, 3};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
        duplicateZeros(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void duplicateZeros(int[] arr) {
        int shifts = 0;
        int current = -1;
//        for(int i=arr.length-1; i > 0; i--){
//            if(arr[i] == 0){
//                if(i == arr.length-1){
//                    arr[i] = arr[i-1];
//                } else {
//
//                }
//                shifts += 1;
//
//            }
//        }

//        for (int i = 1; i < arr.length; i++) {
//            System.out.println("Step " + (i + 1) + " " + Arrays.toString(arr));
//            if (arr[i - 1] == 0) {
//                current = arr[i];
//                arr[i] = 0;
//                i++;
//            } else {
//                if (current != -1) {
//                    int temp = arr[i - 1];
//                    arr[i - 1] = current;
//                    current = temp;
//                }
//            }
//        }

        boolean hasZero = false;
        int store = -1;
        int index = 0;
        while (index < arr.length - 1) {
            if (hasZero) {
                if (arr[index] == 0) {
                    arr[index] = store;
                    store = arr[index + 1];
                    arr[index+1] = 0;
                } else {
                    int temp = store;
                    store = arr[index];
                    arr[index] = temp;
                }
            } else {
                if(arr[index] == 0){
                    hasZero = true;
                    store = arr[index+1];
                    arr[index+1] = 0;
                }
            }
            index++;
        }
    }
}
