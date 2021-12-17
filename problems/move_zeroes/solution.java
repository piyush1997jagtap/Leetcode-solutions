class Solution {
    public void moveZeroes(int[] nums) {
        
        List<Integer> ans = new ArrayList<Integer>();
        for(int i =0; i < nums.length; i++)
        {
          if(nums[i] != 0)
          {
              ans.add(nums[i]);
          }
        }
        
        for(int i = 0; i< ans.size(); i++)
        {
            nums[i] = ans.get(i);
        }
        
        for(int i = ans.size(); i < nums.length; i++)
        {
            nums[i] = 0;
        }
        
        // return nums;
    }
}