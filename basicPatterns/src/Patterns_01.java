import java.util.Scanner;

public class Patterns_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printPattern1(input);
    }

    private static void printPattern1(int input) {
        for(int i= 0; i < input; i++){
            for(int j =0; j < input; j++){
                System.out.print('*');
                if(j != input-1){
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
