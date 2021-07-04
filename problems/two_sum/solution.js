/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let ans = [];
    let newAnswer = new Map();
    for(let i = 0; i< nums.length; i++)
        {
            // for(let j = i+1; j< nums.length; j++)
            //     {
            //         if(nums[i] + nums[j] === target)
            //             {
            //                 ans[0] = i;
            //                 ans[1] = j;
            //             }
            //     }
            if(newAnswer.has(target - nums[i]))
                {
                    ans[0] = i;
                    ans[1] = newAnswer.get(target - nums[i])
                }
            newAnswer.set(nums[i],i);
            
        }
                        return ans;

};