import java.util.ArrayList;
import java.util.List;

public class BinaryConversion {

    private static List<Integer> convertToBinary(int n){
        List<Integer> positions = new ArrayList<>();
        int index =0;
        int count = 0;
        while(n != 0){
            int rem = n % 2;
            if(rem == 1){
                count+=1;
                positions.add(index);
            }
            index += 1;
            n = n/2;
        }

        int pos_len = positions.size();
        for(int i=0; i < pos_len; i++){
            positions.set(i, index-positions.get(i));
        }
        for(int i=0; i < pos_len/2; i++) {
            int temp = positions.get(pos_len-i-1);
            positions.set(pos_len-i-1, positions.get(i));
            positions.set(i, temp);
        }
        positions.add(0, count);

        return positions;
    }

    public static void main(String[] args) {
        int input = 161;
        List<Integer> res = convertToBinary(input);
        for(int i: res){
            System.out.println(i);
        }
    }
}
//        for(int i=31; i>=0; i--){
//            int k = n >> i;
//            if((k&1) > 0){
//                count+=1;
//                positions.add(index+1);
//                converted.add(1);
//            } else {
//                converted.add(0);
//            }
//            index+=1;
//        }