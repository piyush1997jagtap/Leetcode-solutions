class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet();
        
//         public class Wow {
//             int previous;
//             int next;
//         };
        
//          HashMap<> hs = new HashSet();

        
//          for (int i=0; i< nums.length; i++)
//          {
//              if(!hs.contains(nums[i])){
//                  hs.add(nums[i]);
//              }
//              else {
                 
//              }
//          }
        
         HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length ;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],i);
            else{
                if(Math.abs(i-map.get(nums[i]))<=k) return true;
                map.put(nums[i],i);
            }
        }
        return false;
        
    }
}