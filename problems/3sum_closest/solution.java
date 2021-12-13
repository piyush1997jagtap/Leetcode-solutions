class Solution {
    public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
		    int result = nums[0] + nums[1] + nums[nums.length-1]; 
		    for(int i=0; i<nums.length-2; i++){
		    //fixed the a, now will search for b & c from (i+1) index to (nums.length-1) index
		    int a = nums[i];
		    int start = i+1, end=nums.length-1;
		    while(start < end){
		    int currentSum = a+ nums[start] + nums[end];
		    if(currentSum > target){
		    end--;
		    }else{
		    start++;
		    }
		    if(Math.abs(currentSum-target) < Math.abs(result-target)){
		    result = currentSum;
		    }
		    }
		    }
		    return result;
        
       
 }
}