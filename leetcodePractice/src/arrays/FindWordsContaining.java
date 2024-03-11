package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {

    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';
        System.out.println(findWordsContainingBetter(words, x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static List<Integer> findWordsContainingBetter(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("\\b\\w*" + x + "\\w*\\b")) {
                indices.add(i);
            }
        }
        return indices;
    }
}
