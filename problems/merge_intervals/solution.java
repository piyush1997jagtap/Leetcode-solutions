class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <= 1)
        {
            return intervals;
        }
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        List<int[]> output = new ArrayList<>();
        int[] currentInterval = intervals[0];
        output.add(currentInterval);
        
        for(int[] interval: intervals)
        {
            int currentBeg = currentInterval[0];
            int currentEnd = currentInterval[1];
            
            int nextBeg = interval[0];
            int nextEnd = interval[1];

            if(currentEnd >= nextBeg )
            {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                output.add(currentInterval);
            }
        }
        
        return output.toArray(new int[output.size()][]);
    }
}