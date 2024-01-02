import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GcdOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
    }

    public static String gcdOfStringsAlt(String str1, String str2) {
        String ref = str1.length() < str2.length() ? str1 : str2;
        String gcdStr = "";
        int index = 0;
        while(!gcdStr.contains(ref.substring(index, index+1))){
            gcdStr += ref.charAt(index);
            index++;
        }
//        if(str1.length() % gcdStr.length())
        return null;
    }

    public static String gcdOfStrings(String str1, String str2) {
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);
            if (freq.containsKey(currentChar)) {
                freq.put(currentChar, freq.get(currentChar) + 1);
            } else {
                freq.put(currentChar, 1);
            }
        }

        for (int j = 0; j < str2.length(); j++) {
            char currentChar = str2.charAt(j);
            if (freq2.containsKey(currentChar)) {
                freq2.put(currentChar, freq2.get(currentChar) + 1);
            } else {
                freq2.put(currentChar, 1);
            }
        }
        if (freq.size() != freq2.size()) {
            return "";
        }

        if (freq.keySet().equals(freq2.keySet())) {
            return freq.keySet().stream().map(String::valueOf).collect(Collectors.joining());
        }
        return "";
    }
}
