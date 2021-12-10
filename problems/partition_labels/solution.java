class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] array = new int[26];
        int size = 0;
        int end = 0;
        int max = -1;
        int start = 0;
        List<Integer> res = new ArrayList();
        for (int i =0; i < s.length(); i++)
        {
            array[s.charAt(i) - 'a'] = i;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < s.length(); i++)
        {
            
            ++size;
            // if(array[s.charAt(i) - 'a'])
            end = Math.max(end, array[s.charAt(i) - 'a']);
            
            if( i == end )
            {
                 
                res.add(size);
                // start = end + 1;
                size = 0;
            }
        }
        return res;
    }
    
}