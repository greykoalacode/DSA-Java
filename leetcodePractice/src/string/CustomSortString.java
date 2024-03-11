package string;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {
    public static void main(String[] args) {
        String order = "bcafg", s = "abcd";
        System.out.println(customSortString(order, s));
    }

    public static String customSortString(String order, String s) {
        String newOrderString = "";
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (freq.containsKey(s.charAt(i))) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
            } else {
                freq.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < order.length(); i++) {
            char currentChar = order.charAt(i);
            if (freq.containsKey(currentChar)) {
                newOrderString = newOrderString.concat(("" + currentChar).repeat(freq.get(currentChar)));
                freq.remove(currentChar);
            }
        }
        for (char each : freq.keySet()) {

            newOrderString = newOrderString.concat(("" + each).repeat(freq.get(each)));
        }
        return newOrderString;
    }
}
