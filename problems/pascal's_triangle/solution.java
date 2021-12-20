class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
          List<Integer> row = new ArrayList<Integer>();
          row.add(1);
        ans.add(row);
        
        for(int i = 1; i < numRows; i++)
        {
          List<Integer> prevRow = ans.get(i-1);
          List<Integer> row1 = new ArrayList<Integer>();
          row1.add(1);
            
           for(int j =1; j <i; j++ )
           {
               row1.add(prevRow.get(j-1) + prevRow.get(j));
           }
            
           row1.add(1); 
           ans.add(row1);   
            
        }
        return ans;
    
    }
}