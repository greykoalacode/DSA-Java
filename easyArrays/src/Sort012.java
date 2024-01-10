import java.util.ArrayList;
import java.util.List;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0,0,2,1,0,2,1,2};
        sort012(arr);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void sort012(int[] arr)
    {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int i: arr){
            switch (i) {
                case 0 -> zeros++;
                case 1 -> ones++;
                case 2 -> twos++;
                default -> {
                }
            }
        }
        int i = 0;
        while(zeros > 0){
            arr[i] = 0;
            zeros--;
            i++;
        }
        while(ones > 0){
            arr[i] = 1;
            ones--;
            i++;
        }
        while(twos > 0){
            arr[i] = 2;
            twos--;
            i++;
        }
    }
}
