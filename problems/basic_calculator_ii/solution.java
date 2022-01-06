class Solution {
   public int calculate(String s) {
    int len;
    if(s==null || (len = s.length())==0) return 0;
       int currentNum = 0;
       char sign = '+';
       int result = 0;
       int lastNumber = 0;
        for(int i=0;i<len;i++){
        if(Character.isDigit(s.charAt(i))){
            currentNum = currentNum*10+s.charAt(i)-'0';
        }
        if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
            if(sign=='-' || sign == '+'){
                result += lastNumber;
                lastNumber = (sign == '+') ? +currentNum : -currentNum;
            }
       
            if(sign=='*'){
                lastNumber *= currentNum;
            }
            if(sign=='/'){
                lastNumber /= currentNum;
            }
            sign = s.charAt(i);
            currentNum = 0;
        }
    }

  
       result +=lastNumber;
       return result;
}
}