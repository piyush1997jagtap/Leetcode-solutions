class Solution {
    public int maxProfit(int[] prices) {
     int maxSoFar = 0;
        int profit = 0;
        if(prices == null || prices.length <= 1)
        {
            return 0;
        }
        for (int i =1; i < prices.length; i++)
        {
            if(prices[i] > prices[i-1])
            {
                profit += prices[i] - prices[i-1];
            }
        }
        
        return profit;
    }
}