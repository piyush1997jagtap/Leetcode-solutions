class Solution {
    public String convert(String s, int numRows) {
        
        String ans = "";
       if (numRows == 1) return s;
        for(int i=0; i < numRows; i++)
        {
            int cycleLen = 2*(numRows - 1);
            for(int j = i; j < s.length(); j += cycleLen)
            {
                ans += s.charAt(j);
                if(i > 0 && i < numRows - 1 && (j + cycleLen - 2*i) < s.length())
                    ans += s.charAt(j + cycleLen - 2*i);
            }
        }
        return ans;
    }
}