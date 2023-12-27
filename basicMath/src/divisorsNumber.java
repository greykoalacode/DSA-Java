import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class divisorsNumber {
    public static void main(String[] args) {
        long startTime1 = System.nanoTime();
        System.out.println(getDivisors(100038));
        long duration1 = System.nanoTime() - startTime1;
        long startTime2 = System.nanoTime();
        System.out.println(cleanerSolutionShared(100038));
        long duration2 = System.nanoTime() - startTime2;

        System.out.println(duration1+" "+duration2);
    }

    private static long convertNanoToSeconds(long durationInNano){
        return TimeUnit.MILLISECONDS.convert(durationInNano, TimeUnit.NANOSECONDS);
    }

    private static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        int root = (int) Math.floor(Math.pow(n, 0.5));
        divisors.add(1);
        if (n <= 2) {
            if (n == 2) divisors.add(n);
            return divisors;
        }
        for (int i = 2; i <= root; i++) {
            int quotient = n / i;
            if (n % i == 0) {
                if (i != quotient) {
                    divisors.add(quotient);
                }
                divisors.add(i);
            }
        }
        divisors.sort(Integer::compareTo);
        divisors.add(n);
        return divisors;
    }

    private static void naiveDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        // naive approach O(n)
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        divisors.add(n);
    }

    private static List<Integer> cleanerSolutionShared(int n){
        List< Integer > ans = new ArrayList<>();

        // Traversing from 1 to sqrt(N).
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                ans.add(i);
                if (n / i != i)
                {
                    ans.add(n / i);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
