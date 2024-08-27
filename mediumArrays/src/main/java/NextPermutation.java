package main.java;

import java.util.Arrays;

public class NextPermutation {

    // idea is to iterate over the elements and see if we can find greater ones
    public static void nextPermutation(int[] nums) {
        int prefix = nums.length - 1;
        boolean fixed = false;
        while (prefix >= 0 && !fixed) {
            int max_index = prefix;
            int second_min_index = prefix;
            for (int i = prefix; i < nums.length; i++) {
                if (nums[max_index] < nums[i]) {
                    max_index = i;
                }
                if (nums[i] > nums[prefix]) {
                    if (second_min_index != prefix && nums[second_min_index] > nums[i]) {
                        second_min_index = i;
                    } else {
                        if (nums[max_index] > nums[i]) {
                            second_min_index = i;
                        }
                    }
                }
            }
//            System.out.println("max & second max "+nums[max_index]+" "+nums[second_min_index]+" "+nums[prefix]+" index "+(prefix));
            if (max_index == prefix) {
                prefix--;
            } else {
                int swapIndex = second_min_index != prefix ? second_min_index : max_index;
                int temp = nums[swapIndex];
                nums[swapIndex] = nums[prefix];
                nums[prefix] = temp;
                fixed = true;
            }
        }
        if (!fixed) {
            for (int i = 0; i < nums.length / 2; i++) {
                int temp = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public static void nextPermutationAlt(int[] arr) {
        int len = arr.length;
        int ind = -1;
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            // reverse the array since all items are in decreasing manner
            for (int j = 0; j < len / 2; j++) {
                int temp = arr[len - j - 1];
                arr[len - j - 1] = arr[j];
                arr[j] = temp;
            }
        } else {
            // find the item just above indicator
            for (int i = len - 1; i > ind; i--) {
                if (arr[i] > arr[ind]) {
                    // swap the prefix with min
                    int temp = arr[i];
                    arr[i] = arr[ind];
                    arr[ind] = temp;
                    break;
                }
            }

            // sort the rest arr (index: ind+1 -> len-1)
            int start = ind + 1;
            int end = len - 1;
            int diff = (end - start);
//            System.out.println(start + " " + end + " " + diff);
            if (diff == 1) {

                int init = arr[end];
                arr[end] = arr[start];
                arr[start] = init;
            } else {
                for (int j = 0; j < (diff+1)/2; j++) {
//                    System.out.println("within swap " + (start+j) + " " + (end - j));
                    int temp = arr[end - j];
                    arr[end - j] = arr[start+j];
                    arr[start+j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 4, 3, 0, 0};
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{3, 2, 1};
        int[][] inputs = new int[][]{
                {2, 1, 5, 4, 3, 0, 0},
                {1, 2, 3},
                {1, 3, 2},
                {3, 2, 1},
                {5,4,7,5,3,2}
        };
        for (int[] ar : inputs) {

            nextPermutationAlt(ar);
            System.out.println(Arrays.toString(ar));
        }
    }
}
