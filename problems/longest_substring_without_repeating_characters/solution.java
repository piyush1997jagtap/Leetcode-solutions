class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
 
//         int res = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 if (checkRepetition(s, i, j)) {
//                     res = Math.max(res, j - i + 1);
//                 }
//             }
//         }
 
//         return res;
        Set<Character> set = new HashSet<>();
        int count = 0;
        int i = 0;
        int j = 0;
        
        while(i < n)
        {
            if(!set.contains(s.charAt(i)))
            {
               
                set.add(s.charAt(i));
                
                count = Math.max(count, i-j + 1);
                i++;
                
            } else {
                set.remove(s.charAt(j));
                j++;
            }
        }
        return count;
    }
    
    
//     private boolean checkRepetition(String s, int start, int end) {
//         int[] chars = new int[128];
 
//         for (int i = start; i <= end; i++) {
//             char c = s.charAt(i);
//             System.out.println(c);
//             chars[c]++;
//             if (chars[c] > 1) {
//                 return false;
//             }
//         }
//         return true;
//     }
}