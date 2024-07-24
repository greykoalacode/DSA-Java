package org.example;

public class BuyAndSellStock {

//        for(int i=0; i < n; i++){
//            for(int j=i+1; j <n; j++){
//                max = Math.max(max, prices[j]- prices[i]);
//            }
//        }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1; i<n; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else if (prices[i]-minPrice > maxProfit) {
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {7, 1, 5, 3, 6, 4},
                {7, 6, 4, 3, 1}
        };

        for (int[] input : inputs) {
            System.out.println(maxProfit(input));
        }
    }
}
