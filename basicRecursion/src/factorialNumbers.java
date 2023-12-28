import java.util.ArrayList;
import java.util.List;

public class factorialNumbers {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(10));
    }
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> factorials = new ArrayList<>();
        for(long i = 1; i <= n; i++){
            long currentFactorial = fact(i);
            if(currentFactorial > n) break;
            factorials.add(currentFactorial);
        }
        return factorials;
    }

    private static long fact(long n){
        if(n <= 2) return n;
        return n*fact(n-1);
    }
}
