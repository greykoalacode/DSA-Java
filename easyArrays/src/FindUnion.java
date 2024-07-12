import java.util.*;

public class FindUnion {

    public static ArrayList<Integer> findUnionBetter(int[] arr1, int[] arr2, int n, int m){
        int i=0, j=0;
        ArrayList<Integer> Union = new ArrayList<>();
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else {
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n){
            if(Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if(Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }

    public static ArrayList<Integer> findUnionWithMap(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> union = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashSet<Integer> unionSet = new HashSet<>();
        for(int i=0; i< n; i++)
            unionSet.add(arr1[i]);
//            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0)+1);
        for(int i=0; i< m; i++)
            unionSet.add(arr2[i]);
//            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
        for(int it: unionSet){
            union.add(it);
        }
        return union;
    }
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> union = new ArrayList<>();
        int minLength = Math.min(n, m);
        int maxLength = Math.max(n, m);
        for (int i = 0; i < maxLength; i++) {
            if (i >= minLength) {
                for (int j = minLength; j < maxLength; j++) {
                    int curr = maxLength == n ? arr1[j] : arr2[j];
                    if (!union.contains(curr)) {
                        int prevIndex = union.indexOf(curr - 1);
                        int nextIndex = union.indexOf(curr + 1);
                        if (prevIndex != -1) {
                            union.add(prevIndex+1, curr);
                        } else if(nextIndex != -1){
                            union.add(nextIndex-1, curr);
                        } else {
                            union.add(curr);
                        }
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
        int[] arr1 = {-8, -3, -3, -2, 0, 1, 2, 2, 6};
        int[] arr2 = {-9,-9,0};

        int n = arr1.length;
        int m = arr2.length;

        List<Integer> union = findUnion(arr1, arr2, n, m);
        List<Integer> union1 = findUnionWithMap(arr1, arr2, n, m);
        List<Integer> union2 = findUnionBetter(arr1, arr2, n, m);
        for (int i : union2) {
            System.out.println("i = " + i);
        }
    }
}
