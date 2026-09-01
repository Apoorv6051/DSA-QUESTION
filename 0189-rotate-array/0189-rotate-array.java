class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
         k = k % n;

        // Reverse the whole array
        reverse(nums, 0, n - 1);

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, n - 1);

          
        }
    

    static void reverse(int[] nums, int i, int j) {

        while (i < j) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}
        

