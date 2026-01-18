package Problems.All;

public class Solution_0121 {

    public int maxProfit(int[] prices) {

        int minBuy = 10000;
        int max = 0;


        // [7,1,5,3,6,4]
        for(int i=0;i<prices.length;i++) {

            if(prices[i] < minBuy) {
                minBuy = prices[i];
            }

            if(prices[i] > minBuy && prices[i]-minBuy > max) {
                max = prices[i]-minBuy;
            }

        }

        return max;
    }


}
