class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int[] distance = new int[points.length];
        int[][] answer = new int[k][2];
         int a = 0;
        
        for(int i = 0; i < points.length; i++)
        {
            int x = points[i][0];
            int y = points[i][1];
            distance[i] = x*x + y*y;
        }
        Arrays.sort(distance);
        int distk = distance[k-1];
        // System.out.println(distk);
         for(int i = 0; i < points.length; i++)
        {
            
            int x = points[i][0];
            int y = points[i][1];
            int lom = x*x + y*y;
             // System.out.println(lom);
             // System.out.println(distk);
             if(lom <= distk)
             {
                 System.out.println(lom);
                 answer[a][0] = x;
                 answer[a][1] = y;
                 
                 a++;
                 // System.out.println(a);
             }
        }
        return answer;
    }
}