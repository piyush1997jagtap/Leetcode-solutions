class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<Integer>();
        
        
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                return new int[] {map.get(target - nums[i]), i};
                // ans.add(target - nums[i]);
                // ans.add(i);
            }
            
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}