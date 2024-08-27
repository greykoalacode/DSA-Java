import java.util.*;

public class Romanizer {

    public static List<String> romanize(List<Integer> inputs) {
        List<String> result = new ArrayList<>();
        Map<Integer, String> conversions = new LinkedHashMap<>();
        conversions.put(1, "I");
        conversions.put(2, "II");
        conversions.put(3, "III");
        conversions.put(4, "IV");
        conversions.put(5, "V");
        conversions.put(6, "VI");
        conversions.put(7, "VII");
        conversions.put(8, "VIII");
        conversions.put(9, "IX");
        conversions.put(10, "X");
        conversions.put(40, "XL");
        conversions.put(50, "L");
        conversions.put(90, "XC");
        conversions.put(100, "C");
        conversions.put(400, "CD");
        conversions.put(500, "D");
        conversions.put(900, "CM");
        conversions.put(1000, "M");
        List<Integer> conversion_keys = new ArrayList<>(conversions.keySet());
        int conv_len = conversion_keys.size();
        for(int in: inputs){
            String conv = "";
            for(int key = conv_len-1; key >=0; key--){
                int rem = in / conversion_keys.get(key);
                if(rem > 0){
                    conv += conversions.get(conversion_keys.get(key)).repeat(rem);
                    in = in % conversion_keys.get(key);
                }
            }
            result.add(conv);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,49,23);
        List<String> res = romanize(nums);
        for(String re: res){
            System.out.println(re);
        }
    }
}
