public class CheckPalindrome {
    public static void main(String[] args) {

        String str = "c1 O$d@eeD o1c";
        System.out.println(checkPalindrome(str));
    }
    public static boolean checkPalindrome(String str) {

        // WRITE YOUR CODE HERE

        String cleanStr = str.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanStr.length();
        for(int i=0; i< length/2; i++){
            if(cleanStr.charAt(i) != cleanStr.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
