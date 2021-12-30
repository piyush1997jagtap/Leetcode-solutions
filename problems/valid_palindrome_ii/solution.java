class Solution {
    public boolean validPalindrome(String s) {
        s = s.replaceAll("\\s","");
        s = s.toLowerCase();
        int n = s.length() - 1;
        int l = 0;
        
         while( l < n)
        {
            if(s.charAt(l) != s.charAt(n))
            {
                return isPal(s, l+1, n) || isPal(s,l, n-1);
            } else {
               l++;
               n--;  
              }
           
            
        }
        return true;
        
        
    }
    
    private boolean isPal(String s,int i,int j)
    {
        
        while(i < j)
        {
             if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}