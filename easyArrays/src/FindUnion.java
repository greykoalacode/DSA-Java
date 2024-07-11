import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindUnion {
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> union = new ArrayList<>();
        int minLength = Math.min(n, m);
        int maxLength = Math.max(n, m);
        for (int i = 0; i < maxLength; i++) {
            if (i >= minLength) {
                for (int j = minLength; j < maxLength; j++) {
                    int curr = maxLength == n ? arr1[j] : arr2[j];
                    if (!union.contains(curr)) {
                        union.add(curr);
                    }
                }
            } else {
                if (arr1[i] == arr2[i] && !union.contains(arr1[i])) {
                    union.add(arr1[i]);
                } else if (arr1[i] != arr2[i]) {
                    int min = Math.min(arr1[i], arr2[i]);
                    int max = Math.max(arr1[i], arr2[i]);
                    if (!union.contains(min)) {
                        union.add(min);
                    }
                    if (!union.contains(max)) {
                        union.add(max);
                    }
                }
            }
        }
        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 8};
        int[] arr2 = {1, 2, 3, 6, 7};

        int n = arr1.length;
        int m = arr2.length;

        List<Integer> union = findUnion(arr1, arr2, n, m);
        for (int i : union) {
            System.out.println("i = " + i);
        }
    }
}
