public class ReverseNumber {
    public static void main(String[] args) {
        int input = 123;
        int digits = 0;
        int reverse = 0;
        // ^ sign is not for power, it is XOR. don't use it without knowing its consequences
        while(input != 0){
            System.out.println(reverse+" "+digits+" "+input);
            reverse = reverse* (10^digits)+(input%10);
            System.out.println(reverse+" "+(10^digits)+" "+input);
            input /= 10;
        }
        System.out.println(reverse);
    }
}
