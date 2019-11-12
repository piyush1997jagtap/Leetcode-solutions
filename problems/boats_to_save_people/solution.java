class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        int j=people.length-1;
    int wt=0;
        int boat=0;
        Arrays.sort(people);
        while(i<=j)
    {
        wt=people[i]+people[j];
        if(wt<=limit)
        {
            i++;
            j--;
            boat++;
        }
        else if(wt>limit)
        {
            j--;
            boat++;
        }
        
    }
        return boat;
        
    }
}