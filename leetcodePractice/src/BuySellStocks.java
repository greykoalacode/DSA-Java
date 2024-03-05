public class BuySellStocks {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {1,2,3,4,5};
        int[] prices3 = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int len =  prices.length;
        int index1 = 0;
        int index2 = 1;
        int maxGains = 0;
        while(index1 < index2 && index1 < len && index2 < len){
            if(prices[index1] >= prices[index2]){
                maxGains += prices[index1] - prices[index2-1];
                index1++;
                index2++;
            } else {
                index2++;
            }
        }
        return maxGains;
    }
}
