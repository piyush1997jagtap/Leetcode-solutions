class Solution {
    public int trap(int[] height) {
        int end = height.length - 1;
        int leftMax = 0;
        int rightMax= 0;
        int ans =0;
        for (int i =1; i < end; i++)
        {
            int left = height[i];
            for(int j = 0; j < i; j++)
            {
                left = Math.max(left,height[j]);
            }
            int right = height[i];
            for (int k =i+1; k<= end; k++ )
            {
                right = Math.max(right,height[k]);
                
            }
            ans  += Math.min(left,right) - height[i];
            
        }
        return ans;
    }
}