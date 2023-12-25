public class NumberOfDigits {
    public static void main(String[] args) {

        System.out.println(countDigitsMath(954));
    }

    public static int countDigitsMath(int n){
        return (int) Math.floor(Math.log10(n))+1;
    }

    public static int countDigits(int n) {
        // Write your code here.
        int digits = 0;
        while (n != 0) {
//            int mod = n % 10;
            n = n /10;
            digits++;
        }
        return digits;
    }
}