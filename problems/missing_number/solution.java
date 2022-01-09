class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum  = n * (n + 1 ) / 2;
        int sum1 = n;
        // boolean xor = false;
        // boolean xor1 = false
        for(int i = 0 ; i < n ; i++)
        {
            // sum1 += nums[i];
            sum1 ^= nums[i];
            sum1^=i;
        }
        
        return sum1;
    }
}