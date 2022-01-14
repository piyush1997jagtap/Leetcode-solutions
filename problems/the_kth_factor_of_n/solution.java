class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
       for(int i=1; i <=Math.sqrt(n); i++)
       {
           if(n%i ==0)
           {
               ans.add(i);
           }
           
       }
        
        int count = ans.size();
        int fcount = ans.size() * 2;
        if(ans.get(count -1)* ans.get(count-1) == n)
        {
            fcount--;
        }
        
         if(k <= count)
            return ans.get(k-1);
        
        if(fcount < k)
            return -1;
  
        
        // if(count < k)
        //     return n / ans.get(k-1);
            
            
        return n / ans.get(fcount-k);
        
    }
}