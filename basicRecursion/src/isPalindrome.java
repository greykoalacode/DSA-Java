public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abbba"));
    }

    private static boolean isPalindrome(String str) {
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        else if(str.length() <= 3)
            return str.charAt(0) == str.charAt(str.length()-1);
        return isPalindrome(str.substring(1,str.length()-1));
    }
}
