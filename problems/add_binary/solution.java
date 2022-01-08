class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int sum = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int digit1 = 0;
        int digit2 = 0;
        StringBuilder res = new StringBuilder();
//         This or is to ensure if we can traverse both the strings
        while(i >= 0 || j >=0)
        {
           if(i >= 0)
               digit1 = a.charAt(i) - '0';
            else
                digit1 = 0;
            
//             This if else loop is necessary to add extra zeroes if one string is less than other
            if(j >= 0)
               digit2 = b.charAt(j) - '0';
             else
                digit2 = 0;
            
            sum = digit1+digit2+carry;
            carry = sum / 2;
            res.append(sum%2);
            i--;
            j--;
        }
        

        if(carry!=0)
            res.append(carry);
        
        return res.reverse().toString();
    }
}