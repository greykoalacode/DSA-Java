public class fibonacciSeries {
    public static void main(String[] args) {
        int[] result = generateFibonacciNumbers(7);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] fibo = new int[n];
        if (n == 1) {
            fibo[0] = 0;
        } else if (n > 2) {
            fibo[1] = 1;
            fibo = generateFibonacciNumbersRec(fibo, 2, n);
        }
        return fibo;
    }

    public static int[] generateFibonacciNumbersRec(int[] fibo, int index, int n) {
        // Write your code here.
        if (index == n) {
            return fibo;
        }
        fibo[index] = fibo[index - 1] + fibo[index - 2];
        return generateFibonacciNumbersRec(fibo, index + 1, n);
    }
}
