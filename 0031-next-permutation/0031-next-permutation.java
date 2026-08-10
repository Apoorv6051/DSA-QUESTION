class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Step 1: find the first index (from the right) where nums[i] < nums[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: if such an index exists, find the smallest element to its right
        // that is still bigger than nums[index], and swap them
        if (index != -1) {
            for (int j = n - 1; j > index; j--) {
                if (nums[j] > nums[index]) {
                    int temp = nums[index];
                    nums[index] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }

        // Step 3: reverse everything after 'index' to get the smallest possible
        // arrangement of that suffix (handles both the found case AND
        // the index==-1 case, which reverses the WHOLE array)
        reverse(nums, index + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}