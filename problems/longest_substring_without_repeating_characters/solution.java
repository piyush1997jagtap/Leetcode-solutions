class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int start_pointer = 0;
        int end_pointer = 0;
        int maxLength = 0;
        while(end_pointer < s.length())
        {
            if(!set.contains(s.charAt(end_pointer)))
               {
                   set.add(s.charAt(end_pointer));
                   end_pointer++;
                   maxLength = Math.max(maxLength, set.size());
               }
               else {
                   set.remove(s.charAt(start_pointer));
                   start_pointer++;
               }
        }
               return maxLength;
    }
}