import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        int n = arr.length;
        System.out.println(Arrays.toString(secondLargestAlt(arr, n)));

    }

    public static int[] secondLargestAlt(int[] a, int n){
        int max = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, second_min = Integer.MAX_VALUE;
        for(int i: a){
            if(max < i){
                second_max = max;
                max = i;
            } else if(second_max < i && max != i){
                second_max = i;
            }
            if(min > i){
                second_min = min;
                min = i;
            } else if (second_min > i && min != i) {
                second_min = i;
            }
        }
        return new int[] {second_max, second_min};
    }

    public static int[] secondLargest(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] secondMinMax = {0, Integer.MAX_VALUE};
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for(int i: arr){
            if(max-secondMinMax[0] > max-i && i != max){
                secondMinMax[0] = i;
            }
            if(secondMinMax[1]-min > i-min && i != min){
                secondMinMax[1] = i;
            }
        }
        return secondMinMax;
    }
}
