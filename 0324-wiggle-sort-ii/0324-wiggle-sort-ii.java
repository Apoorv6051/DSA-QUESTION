class Solution {
    public void wiggleSort(int[] nums) {
        // Step 1: Create a frequency map. Since max value is 5000, size 5001 is enough.
        int[] count = new int[5001];
        for (int num : nums) {
            count[num]++;
        }
        
        int max_val = 5000;
        
        // Step 2: Fill the Peaks (odd indices) with the largest available numbers.
        for (int i = 1; i < nums.length; i += 2) {
            while (count[max_val] == 0) {
                max_val--;
            }
            nums[i] = max_val;
            count[max_val]--;
        }
        
        // Step 3: Fill the Valleys (even indices) with the remaining smaller numbers.
        for (int i = 0; i < nums.length; i += 2) {
            while (count[max_val] == 0) {
                max_val--;
            }
            nums[i] = max_val;
            count[max_val]--;
        }
    }
}