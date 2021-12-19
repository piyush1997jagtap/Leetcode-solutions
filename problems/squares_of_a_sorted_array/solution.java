class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int k = nums.length - 1;
        int ans[] = new int[nums.length];
        while(l <= r)
        {
            if(Math.abs(nums[l]) < Math.abs(nums[r]))
            {
                ans[k] = nums[r] * nums[r];
                r--;
            } else {
                ans[k] = nums[l] * nums[l];
                l++;
            }
            k--;
            
        }
        return ans;
    }
}