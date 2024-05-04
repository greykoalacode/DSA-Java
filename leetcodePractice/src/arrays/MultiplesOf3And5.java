package arrays;

import java.util.Scanner;

public class MultiplesOf3And5 {
    private static int generateSum(int n){
        return (n*(n+1))/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int totalSum = 0;
            int divisibleBy3 = (n-1) / 3;
            int divisibleBy5 = (n - 1)/5;
            totalSum += (3*generateSum(divisibleBy3))+ (5*generateSum(divisibleBy5));
            if(n > 15){
                int divisibleBy15 = (n-1)/15;
                totalSum -= (15*generateSum(divisibleBy15));
            }
            System.out.println(totalSum);
        }
    }
}
