public class _121BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }

            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }


    public static void main(String[] args) {
        int[] test = {7,1,5,3,6,4};
        int[] test1 = {7,6,4,3,1};
        System.out.println(maxProfit(test)); // 5
        System.out.println(maxProfit(test1)); // 0
    }
}
