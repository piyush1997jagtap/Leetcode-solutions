class Solution {
    public int[] productExceptSelf(int[] nums) {
        int end = nums.length;
        int[] productArray = new int[nums.length];
        int prod;
        int temp = 1;
         productArray[0] = 1;
        
        for (int i =0; i < end; i++)
        {
                productArray[i] = temp;
                temp = temp * nums[i];
                // leftProduct[i] = nums[i-1]*leftProduct[i-1];
        }
            temp = 1;
            for (int k = end-1; k >= 0 ; k--)
            {
               productArray[k] *= temp;
                temp = temp * nums[k];
    
            }
            
          
        return productArray;
    }
}