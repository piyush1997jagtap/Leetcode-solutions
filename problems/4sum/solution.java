class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int sum1 = 0;
        for(int i = 0; i < nums.length - 3; i++)
        {
            int a = nums[i];
            if(i> 0 && nums[i] == nums[i-1])
                continue;
            for(int j = i+1; j < nums.length - 2; j++)
            {
                int b = nums[j];
                if(j > i+1 && nums[j] == nums[j-1])
                    continue;
                 int start = j + 1;
                 int end = nums.length -1;
                  while(start < end)
               {
                sum1 = a + b + nums[start] + nums[end];
                
                   if(sum1 < target)
                {
                    start++;
                }
                   if(sum1 > target)
                {
                    end--;
                }
                
                if(sum1 == target)
                {
                    result.add(Arrays.asList(a,b,nums[start],nums[end]));
                    
                    while(start < end && nums[start] == nums[start+1])
                        start++;
                    
                    while(start < end && nums[end] == nums[end-1])
                        end--;
                    
                    start++;
                    end--;
                    
                }
             }
          }

            
        }
        return result;
    }
}