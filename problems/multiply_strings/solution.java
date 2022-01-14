class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        StringBuilder firstNumber = new StringBuilder(num1);
        StringBuilder secondNumber = new StringBuilder(num2);
         
        firstNumber.reverse();
        secondNumber.reverse();
        
        // To store the multiplication result of each digit of secondNumber with firstNumber.
        int N = firstNumber.length() + secondNumber.length();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            ans.add(0);
        }
        
        for (int i = 0; i < secondNumber.length(); ++i) {
            // Add the current result to final ans.
            ans = addStrings(multiplyOnedigit(firstNumber, secondNumber.charAt(i),i),ans);
        }
          if (ans.get(ans.size() - 1) == 0) {
            ans.remove(ans.size() - 1);
        }
        
         StringBuilder answer = new StringBuilder();
        
        for (int i = ans.size() - 1; i >= 0; --i) {
            answer.append(ans.get(i));
        }
        
        return answer.toString();
        
    }
    
   private ArrayList<Integer> multiplyOnedigit(StringBuilder firstNo, char secondNo, int zero) {
        
        ArrayList<Integer> curr = new ArrayList<>();
        for(int i =0; i < zero; i++)
        {
            curr.add(0);
        }
        
        int carry = 0;
        for(int i =0; i < firstNo.length(); i++)
        {
            int sum = (firstNo.charAt(i) - '0') * (secondNo - '0') + carry;
            carry = sum/10;
            curr.add(sum%10);
        }
        
        if(carry !=0)
            curr.add(carry);
        
        return curr;    
        
    }
    private ArrayList<Integer> addStrings(ArrayList<Integer> num1, ArrayList<Integer> num2)
    {
          ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        
        for(int i =0; i < num1.size() || i < num2.size(); i++)
        {
           int digit1 = i < num1.size() ? num1.get(i) : 0;
           int digit2 = i < num2.size() ? num2.get(i) : 0; 
            
            int sum = digit1 + digit2 + carry;
            carry = sum/10;
            ans.add(sum%10);

        }
        if(carry != 0)
            ans.add(carry);
        
        return ans;
    }
    
}