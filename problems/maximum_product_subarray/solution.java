class Solution {
    public int maxProduct(int[] arr) {
        int result = arr[0];
        int n = arr.length;
 
        for (int i = 0; i < n; i++)
        {
            int mul = arr[i];
            // traversing in current subarray
            for (int j = i + 1; j < n; j++)
            {
                // updating result every time
                // to keep an eye over the
                // maximum product
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            // updating the result for (n-1)th index.
            result = Math.max(result, mul);
        }
        return result;
    }
}