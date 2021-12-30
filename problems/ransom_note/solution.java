class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int l = ransomNote.length() -1;
        int r = magazine.length() -1;
        HashMap<Character, Integer> map = new HashMap<>();
        if(l > r)
            return false;
        
        for(int i = 0; i<= r; i++)
        {
            if(map.containsKey(magazine.charAt(i)))
            {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            } else {
                System.out.println(magazine.charAt(i));
                map.put(magazine.charAt(i), 1);
            }
        }

        for(int i = 0; i<= l; i++)
        {
            char cur = ransomNote.charAt(i);
            if(map.containsKey(cur))
               {
                   if(map.get(cur) !=0)
                   {
                      map.put(cur, map.get(cur) - 1);
                   } else {
                       return false;
                   }
                       
               } else {
                return false;
            }
        }
        return true;
    }
}