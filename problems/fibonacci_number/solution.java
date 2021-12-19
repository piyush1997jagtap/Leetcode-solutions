class Solution {
    public int fib(int n) {
        // int ans[] = new int[n];
        // ans[0] = 0;
        // ans[1] = 1;
        if(n == 1 || n ==0)
            return n;
        int a = 0;
        int b = 1;
        int c =0;
        for(int i =2; i <= n; i++)
        {
           // ans[i] = ans[i-1] + ans[i-2]; 
            c = a+b;
            a = b;
            b = c;
            
        }
        return c;
    }
}