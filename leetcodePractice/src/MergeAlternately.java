public class MergeAlternately {
    public static void main(String[] args) {
        System.out.println(mergeStringsAlt("ab","pqrs"));
        System.out.println(mergeStringsAltBetter("ab","pqsd"));
    }

    private static String mergeStringsAlt(String word1, String word2){
        int minLen = Math.min(word1.length(), word2.length());
        String excess = word1.length() > word2.length() ? word1.substring(minLen) : word2.substring(minLen);
        String newStr = "";
        for(int i = 0; i < minLen; i++){
            newStr = newStr.concat(String.valueOf(word1.charAt(i))+String.valueOf(word2.charAt(i)));
        }
        return newStr.concat(excess);
    }

    private static String mergeStringsAltBetter(String word1, String word2){
        int minLen = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < minLen; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(word1.substring(minLen)).append(word2.substring(minLen));
        return sb.toString();
    }
}
