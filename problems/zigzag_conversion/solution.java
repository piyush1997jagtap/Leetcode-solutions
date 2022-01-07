class Solution {
//     public String convert(String s, int numRows) {
     
//          if (numRows == 1) return s;
//         List<StringBuilder> rows = new ArrayList<>();
//         int n = s.length();
        
//         for (int i = 0; i <numRows; i++)
//             rows.add(new StringBuilder());
        
//         int curRow = 0;
//         boolean down = false;
        
//         for(char c: s.toCharArray())
//         {
//             rows.get(curRow).append(c);
//             if(curRow == 0 || curRow == numRows-1)
//             {
//                 down = !down;
                
//             }
//             curRow += down ? 1 : -1;
            
//         }
//         StringBuilder ret = new StringBuilder();
//         for (StringBuilder row : rows) ret.append(row);
//         return ret.toString();
//     }
    
        public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        

        for (int i = 0; i < numRows; i++) {
            int cycleLen = 2 * (numRows - 1);
            for (int j = i; j < n; j += cycleLen) {
                ret.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && j + cycleLen - 2*i < n)
                {
                    System.out.println(s.charAt(j + cycleLen - 2*i));
                    ret.append(s.charAt(j + cycleLen - 2*i));
                }

            }
        }
        return ret.toString();
    }
}