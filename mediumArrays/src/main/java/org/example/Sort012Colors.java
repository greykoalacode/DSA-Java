package org.example;

import java.util.Arrays;

public class Sort012Colors {
    public static void main(String[] args) {
        int[][] nums = {
                {2,0,2,1,1,0},
                {2,0,1}
        };

        System.out.println(2^2^2^1^1^1^1^2^2);
        for(int[] arr: nums){
            System.out.println("input "+Arrays.toString(arr));
//            sortColors(arr);
            sortColorsEfficient(arr);
            System.out.println("output "+Arrays.toString(arr));
        }
    }

    public static void sortColorsEfficient(int[] nums){
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void sortColors(int[] nums){
        int zeros = 0, ones = 0, twos = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0)
                zeros++;
            else if(nums[i] == 1)
                ones++;
            else if(nums[i] == 2)
                twos++;
        }
        int index = 0;
        while(zeros != 0){
            nums[index++] = 0;
            zeros--;
        }
        while (ones != 0){
            nums[index++] = 1;
            ones--;
        }
        while(twos != 0){
            nums[index++] = 2;
            twos--;
        }
    }
}
