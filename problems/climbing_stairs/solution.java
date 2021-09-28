class Solution {
    public int climbStairs(int n) {
     // int a = 0;
      int dp[] = new int[n+2];
//     if( n == 0) 
//         return 0;
        
//     if( n == 1 )
//         return 1;
        
//     if( n == 2 )
//         return 2;
        
     // f(1) + f(2) = f(3)
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 2;
    for(int i = 3; i <= n; i++)
    {
            dp[i] = dp[i-1] + dp[i-2];

    }
    return dp[n];


    }
}