class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int digit;
        int newNumber = x;
        while(x >0)
        {
            digit = x%10;
            x = x/10;
            rev = rev*10 +digit;
        }
        if( newNumber == rev)
        {
                        return true;
        }
        else
        {
                    return false;

        }
    }
}