class Solution {
    public int maxArea(int[] height) {
        int first = 0;
        int second = 0;
        int area = 0;
        int length = 0;
        int height1 = 0;
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        // for(int i =0; i < height.length; i++)
        // {
        //     first = height[i];
        //     for(int j = i+1; j < height.length; j++)
        //     {
        //         second = height[j];
        //         height1 = Math.min(first, second);
        //         length = j - i;
        //         area = height1 * length;
        //         maxArea = Math.max(maxArea, area);
        //     }
        //        // maxArea = Math.max(maxArea, area);
        // }
        // return maxArea;
        while(l < r)
        {
            area = Math.min(height[l], height[r]) * (r-l);                                 maxArea = Math.max(area, maxArea);

            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxArea;
        
    }
}