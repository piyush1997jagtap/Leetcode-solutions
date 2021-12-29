class Solution {
    public String addStrings(String num1, String num2) {
        String res = "";
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        int carry = 0;
        int sum = 0;
        
        while(n1 >=0 || n2 >=0 || carry!= 0)
        {
            int a = n1 >= 0 ? num1.charAt(n1) - '0' : 0;
            int b = n2 >= 0 ? num2.charAt(n2) - '0' : 0;
            n1--;
            n2--;
            sum = a + b;
            int value = sum + carry;
            res = (value%10) + res; 
            carry = value/10;
        }
      return res;
    }
}