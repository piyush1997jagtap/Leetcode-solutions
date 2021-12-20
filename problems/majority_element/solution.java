class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        int count = 1;
        int ansIndex = 0;
        
        for(int i =0 ; i< nums.length; i++)
        {
            if(nums[i] == nums[ansIndex])
            {
                count++;
            } else {
                count--;
                
            }
            
            if(count == 0)
            {
                ansIndex = i;
                count = 1;
            }
            
        }
        return nums[ansIndex];
//         for(int i =0; i < nums.length; i++)
//         {
//             if(!map.containsKey(nums[i]))
//             {
//                 map.put(nums[i], 1);
                
//             } else {
//                 map.put(nums[i], map.get(nums[i]) + 1);
//             }
//             // count = map.getOrDefault(nums[i], 0) + 1;
//             // System.out.println(count);
//         }
        
//      for(Map.Entry<Integer, Integer> entry: map.entrySet())
//      {
//          if(entry.getValue() > Math.floor(nums.length/2))
//          {
//              return entry.getKey();
//          }
//      }

        // return -1;
    }
}