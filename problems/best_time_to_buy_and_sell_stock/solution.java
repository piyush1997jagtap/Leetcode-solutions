class Solution {
    public int maxProfit(int[] prices) {
        int profitSoFar = 0;
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i=0; i < prices.length; i++)
        {
            minPrice = Math.min(prices[i], minPrice);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        
        return profit;
    }
}