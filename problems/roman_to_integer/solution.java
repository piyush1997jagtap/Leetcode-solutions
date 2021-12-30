class Solution {
    public int romanToInt(String s) {
         Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int num = 0;
        for(int i =0; i <s.length(); i++)
        {
         if(i+1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
           {
               num -= map.get(s.charAt(i)) ;
           } else{
                num += map.get(s.charAt(i));
           } 
            System.out.println(s.charAt(i));
            
        }
        
     // if(map.get(s.charAt(s.length()-2)) < map.get(s.charAt(s.length()-1)))
     //       {
     //           num -= map.get(s.charAt(s.length()-1)) ;
     //       } else{
     //            num += map.get(s.charAt((s.length()-1)));
     //       } 
        return num;
    }
}