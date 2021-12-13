class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        HashMap<Integer, Integer> map  = new HashMap<>();
        int sum = 0;
        int res = 0;
        for(int i = 0; i < nums1.length; i++)
        {
           for(int j = 0 ; j < nums1.length; j++)
           {
               int sum12 = nums1[i] + nums2[j];
                map.put(sum12, map.getOrDefault(sum12, 0 ) + 1);
           }
        } 
            
        for(int i =0; i < nums1.length; i++)
        {
            for(int j=0; j< nums1.length; j++)
            {
                if(map.containsKey(-nums3[i]-nums4[j]))
                {
                    res+= map.get(-nums3[i]-nums4[j]);
                }
            }
        }
            return res;
        
        }
    }
