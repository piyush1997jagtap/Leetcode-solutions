class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int length;
        int area = 0;
        int start = 0;
        int end = height.length -1;
         
        while(start < end)
        {
            area = Math.min(height[start],height[end]) * (end - start);
            if(area > maxArea)
                maxArea = area;
            if(height[start] < height[end])
            {
                                start = start + 1;

            }
            else
            {
                                end = end - 1;

            }
            
        }

        
        return maxArea;
    }
}