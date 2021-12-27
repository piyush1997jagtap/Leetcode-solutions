class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = 0;
        int column = 0;
        int maxR = matrix.length - 1;
        int maxC = matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();
        while(row <= maxR && column <= maxC)
        {
            for(int i = column; i <= maxC; i++ )
            {
              ans.add(matrix[row][i]);     
            }
            row++;
            
            for(int i = row; i <= maxR; i++)
            {
                ans.add(matrix[i][maxC]);
            }
            maxC--;
            
            if(row <= maxR ){
                 for(int j = maxC; j >=column; j--)
            {
                ans.add(matrix[maxR][j]);
            }
            maxR--; 
            }

            if(column <= maxC){
                 for(int k = maxR; k>= row; k--)
            {
                ans.add(matrix[k][column]);
            }
                column++;
            }
           
        }
        return ans;
    }
}