public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(checkBoolean(101));
    }

    private static boolean checkBoolean(int n) {
        return n == reverseNumber(n);
    }

    private static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }
        return reverse;
    }
}


