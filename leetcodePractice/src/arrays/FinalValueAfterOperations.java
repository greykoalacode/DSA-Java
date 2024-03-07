package arrays;


public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] ops = {"--X", "X++", "X++"};
        String[] ops1 = {"++X", "++X", "X++"};
        String[] ops2 = {"X++", "++X", "--X", "X--"};
        System.out.println(finalValueAfterOperations(ops));
        System.out.println(finalValueAfterOperations(ops1));
        System.out.println(finalValueAfterOperations(ops2));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int finValue = 0;
        for (String operation : operations) {
            if (operation.charAt(0) == '+' || operation.charAt(1) == '+') {
                finValue += 1;
            } else {
                finValue -= 1;
            }
        }
        return finValue;
    }
}
