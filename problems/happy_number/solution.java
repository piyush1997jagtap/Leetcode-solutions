class Solution {
    public boolean isHappy(int n) {
//         Set<Integer> seen = new HashSet<>();
//         while(n!=1 && !seen.contains(n))
//         {
//             seen.add(n);
//             n = getNext(n);
//         }
        
//         return n == 1;
        
        int slowptr = n;
        int fastptr = getNext(n);
        
        while(fastptr != 1 && slowptr != fastptr)
        {
            slowptr = getNext(slowptr);
            fastptr = getNext(getNext(fastptr));
        }
        
        return fastptr == 1;
    }
    
      private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
}