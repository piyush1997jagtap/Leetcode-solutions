class Solution {
    public int maximumProduct(int[] arr) {
        int n = arr.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE; 
        
        for(int i = 0; i < n; i++)
        {
            int value = arr[i];
            if(value >= max1 )
            {
                max3 = max2;
                max2 = max1;
                max1 = value;
            } else if(value >= max2)
            {
                max3 = max2;
                max2 = value;
            } else if(value >= max3)
            {
                max3 = value;
            }
            
            if(value <= min1)
            {
                min2 = min1;
                min1 = value;
            } else if(value <= min2){
                min2 = value;
            }
        }
        
        return Math.max((min1*min2*max1), (max1*max2*max3));
     
    }
}