class Solution {
    public boolean containsDuplicate(int[] nums) {
//         boolean value = false;
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         for (int i=0; i< nums.length; i++)
//         {
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i],map.get(nums[i])+1);
//             }
            
//             else {
//                 map.put(nums[i],1);
//             }
//         }
//          for (Map.Entry entry : map.entrySet()) {
//              System.out.println(entry.getKey() + " " + entry.getValue());
//             if((int)entry.getValue() > 1)
//             {
//                 value = true;
//                 System.out.println(value);
//             }
               
//          }
//         return value;    
        
//         HashSet<Integer> numSet = new HashSet<>();
        
//         for (int i = 0; i < nums.length; i++) {
//             if (!numSet.add(nums[i])) return true;
//         }
        
//         return false;
        
            if(nums==null||nums.length==0)
            return false;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    
    }
}