package _121_Best_Time_to_By_and_Sell_Stock;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{8, 1, 5, 3, 6, 4}));
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }


    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}
