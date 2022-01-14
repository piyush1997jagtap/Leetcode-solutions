class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> set =new HashSet<>();
        set.add(dist(p1,p2));
        set.add(dist(p1,p3));
        set.add(dist(p1,p4));
        set.add(dist(p2,p4));
        set.add(dist(p3,p4));
        set.add(dist(p2,p3));
        if(!set.contains(0) && set.size()==2)
            return true;
        return false;
    }
    
    private int dist(int[] a, int[] b)
    {
        return (a[0]-b[0]) * (a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
}