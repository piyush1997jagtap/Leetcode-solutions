class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int l = m - 1;
        int r = n - 1;
        int k = m + n-1;

        while(l >= 0 && r >= 0)
        {
            if(nums1[l] < nums2[r])
            {
                nums1[k--] = nums2[r--];
                // k--;
                // r--;
            } else
            {
                nums1[k--] = nums1[l--];
                // k--;
                // l--;
            }
            
        }
        
        while(l>=0)
        {
                nums1[k--] = nums1[l--];
                // l--;
                // k--;
        }
        
        while(r>=0)
        {
            nums1[k--] = nums2[r--];
            
        }  
        
    }
}



// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = m - 1, j = n - 1, k = m + n - 1;
        
//         while (i >= 0 && j >= 0) {
//             nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
//         }
        
//         while (i >= 0) {
//             nums1[k--] = nums1[i--];
//         }
        
//         while (j >= 0) {
//             nums1[k--] = nums2[j--];
//         }
//     }
// }