class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int lsum[] = new int[length];
        int rsum[] = new int[length];
        int sum[] = new int[length];

        lsum[0] = 1;
        rsum[length-1] = 1;
        for(int i=1 ; i<length ;i++){
            lsum[i] = lsum[i-1] * nums[i-1];
        }
        
        for(int j = length - 2 ; j>= 0; j--)
        {
            rsum[j] = rsum[j+1] * nums[j+1];
        }
        
         for(int i=0 ; i<length ; i++){
            sum[i] = lsum[i] * rsum[i];
        }
        return sum;
        
    }
}