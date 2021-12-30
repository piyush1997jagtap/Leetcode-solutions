class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s","");
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", ""); 
        int n = s.length() -1;
        int l = 0;
        System.out.println(s);
        while( l < n)
        {
            if(s.charAt(l) != s.charAt(n))
            {
                return false;
            }
            l++;
            n--;
            
        }
        return true;
    }
}