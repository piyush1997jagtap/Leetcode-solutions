class Solution {
    public int titleToNumber(String columnTitle) {
     int sum = 0;
     System.out.println(columnTitle.length()+"l");
     for(int i =columnTitle.length() - 1; i >= 0; i--)
     {
              System.out.println(columnTitle.length()+"l");

         System.out.println(Math.pow(26, columnTitle.length() -1- i));
         sum = sum + (columnTitle.charAt(i) - 'A' + 1) * (int)Math.pow(26, columnTitle.length()  -i - 1);
     }
        return sum;
        
    }
}