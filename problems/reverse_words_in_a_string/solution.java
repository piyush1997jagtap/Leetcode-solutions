class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        String result = "";
        System.out.println(i +"i");
        while(i >= 0)
        {
             while(i >= 0 && s.charAt(i) == ' ')
            {
                i--;
            }
            int j = i;
            
            if(i <0)
                break; 
            
            while(i >= 0 && s.charAt(i) != ' ')
            {
                i--;
            }
         
             // String sub = s.substring(i+1, j+1);
            
            if(result.isEmpty())
            {
                result = result.concat(s.substring(i+1, j+1)); 
            } else {
                result = result.concat(" " + s.substring(i+1, j+1));
            }
            
        }
        return result;
    }
}