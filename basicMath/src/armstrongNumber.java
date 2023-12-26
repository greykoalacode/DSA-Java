import java.util.ArrayList;
import java.util.List;

public class armstrongNumber {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(154));
    }

    // I tried using a list here to store the digits and then run the loop to sum it over.
    // But that would have taken some space, so went with this as referred here
    // https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not/#:~:text=an%20Armstrong%20Number.-,Code%3A,-C%2B%2B%20Code
    private static boolean checkArmstrong(int n) {
        int digits = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        int sum = 0;
        temp = n;
        while(temp != 0) {
            sum += Math.pow(temp%10, digits);
            temp /= 10;
        }
        return sum == n;
    }
}
