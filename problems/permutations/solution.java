class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<Integer> sol = new ArrayList<>();
       boolean[] freq = new boolean[nums.length];
       List<List<Integer>> ans = new ArrayList<>(); 
       gen(nums, sol, freq, ans);
        return ans;
        

    }
    
     public void gen(int[] nums,List<Integer> sol,boolean[] freq,List<List<Integer>> ans)
        {
            if(sol.size() == nums.length)
            {
                ans.add(new ArrayList<>(sol));
                return;
            }
            
            for(int i = 0 ; i< nums.length; i++)
            {
                if(!freq[i])
                {
                    freq[i] = true;
                    sol.add(nums[i]);
                    gen(nums, sol, freq,ans);
                    sol.remove(sol.size() -1);
                    freq[i] = false;
                }
            }
            
        }
}