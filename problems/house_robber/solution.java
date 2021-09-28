class Solution {
    public int rob(int[] nums) {
      int dp[] = new int[nums.length+1];
      dp[0] = 0;
      dp[1] = nums[0];
        int cost = 0;
        // dp[0]  for 0 houses ---> 0
        //  dp[1] for 1 houses ---> nums[0] 
       // if(nums.length == 0)
       //     return 0;
       //  if(nums.length == 1)
       //      return nums[0];
       //  if(nums.length == 2)
       //      return Math.max(nums[0],nums[1]);
      
         
            
        for(int i=1; i<= nums.length-1; i++)
        {
            dp[i+1] = Math.max(dp[i],dp[i-1] + nums[i]);
        }
        return dp[nums.length];
        
    }
}