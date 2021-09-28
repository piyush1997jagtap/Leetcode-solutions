class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length - 1;
        // int money = 0;
        // int maxMoney = INT.MAX;
        // while( n != 0) {
        //     money = cost[n];
        //     n--;
        // }
        int dp[] = new int[n+1];
        dp[0] = cost[0]; 
        dp[1] = cost[1];
        for(int i = 2; i<= n; i++)
        {
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        
      


        return Math.min(dp[cost.length-1]  , dp[cost.length-2]  );
    }
}