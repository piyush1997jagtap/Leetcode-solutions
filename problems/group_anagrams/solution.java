class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         if (strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<HashMap<Character, Integer>, ArrayList<String>> ans = new HashMap<HashMap<Character, Integer>, ArrayList<String>>();
        
        
        for(String s: strs )
        {
            HashMap<Character, Integer> map = new HashMap<>();
            
            for(int i = 0; i < s.length(); i++)
            {
                  if(map.containsKey(s.charAt(i)))
               {
                 int x = map.get(s.charAt(i));
                 map.put(s.charAt(i), x+1);
               } else {
                      map.put(s.charAt(i), 1);
                  } 
                
            }
            
            if(ans.containsKey(map))
            {
                ans.get(map).add(s);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                ans.put(map,temp);
            }
            
        }
        List<List<String> >
            result = new ArrayList<>(); 
        
        
        for(HashMap<Character, Integer> a: ans.keySet())
        {
            result.add(ans.get(a));
        }
            
            
        return result;
    }
}







