class Solution {
    public String intToRoman(int num) {
         HashMap<Integer, String> romanValue = new LinkedHashMap<>();

        romanValue.put(1000, "M");
        romanValue.put(900, "CM");
               
       romanValue.put(500, "D");
        romanValue.put(400, "CD");
        romanValue.put(100, "C");
         romanValue.put(90, "XC");
        romanValue.put(50, "L");
         romanValue.put(40, "XL");
      romanValue.put(10, "X");
        romanValue.put(9, "IX");
         romanValue.put(5, "V");
        romanValue.put(4, "IV");
         romanValue.put(1, "I");
       
        

        StringBuilder roman = new StringBuilder();
        
        for(Map.Entry<Integer,String> entry : romanValue.entrySet()){
           
             int symbols = num/entry.getKey();
            while(symbols != 0)
            {
                roman.append(entry.getValue());
                symbols--;
            }
            num = num % entry.getKey();
            
        }
        return roman.toString();
    }
}