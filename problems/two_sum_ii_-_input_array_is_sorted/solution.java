class Solution {
    public int[] twoSum(int[] numbers, int target) {
           HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<Integer>();
        
        
        for(int i = 0; i < numbers.length; i++)
        {
            if(map.containsKey(target - numbers[i]))
            {
                return new int[] {map.get(target - numbers[i]), i+1};
                // ans.add(target - nums[i]);
                // ans.add(i);
            }
            
            map.put(numbers[i],i+1);
        }
        return new int[] {};   
    }
}