package arrays;

import java.util.Arrays;

public class PivotNumber {
    public static void main(String[] args) {
        System.out.println(pivotIntegerBetter(4));
    }

    public static int pivotIntegerBetter(int n) {
        int sum = (n*(n+1))/2;
        int x = (int) Math.sqrt(sum);
        if (x * x == sum) return x;
        return -1;

    }

    public static int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int[] sumArr = new int[n];
        int pivotNum = -1;
        sumArr[0] = 1;
        for (int i = 1; i < n; i++) {
            sumArr[i] = sumArr[i - 1] + (i + 1);
        }
        for (int j = 1; j < n - 1; j++) {
            if (sumArr[j] == (sumArr[n - 1] - sumArr[j - 1])) {
                pivotNum = sumArr[j] - sumArr[j - 1];
            }
        }
        System.out.println(Arrays.toString(sumArr));
        return pivotNum;
    }
}
