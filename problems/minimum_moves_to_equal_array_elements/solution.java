import java.util.Collections;
class Solution {
    public int minMoves(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
int min2 = 0;
        int moves = 0;
        int maxCount =0;
        int count = 0;
        for(int i: nums)
        {
           max = Math.max(max, i);
           min = Math.min(min, i);
        }
     
        for(int i: nums)
        {
            moves+= i - min;
        }
                     
     return moves;
    }
}