class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        String prefix = "";
        if(strs.length == 1)
            return strs[0];
        int len = find(strs);
        System.out.println(len);

        for(int i = 0; i< len; i++)
        {
            Character s = strs[0].charAt(i);
            System.out.println(s);
            for(int j = 1; j < strs.length; j++)
            {
                if(strs[j].charAt(i) != s)
                    return prefix;
            }
            prefix += s;
        }
        return prefix;
    }
    
    private int find(String[] arr)
    {
        int min = arr[0].length();
        for(int i =0; i < arr.length; i++)
        {
            min = Math.min(arr[i].length(), min);
        }
        System.out.println(min);
        return min;
    }

}