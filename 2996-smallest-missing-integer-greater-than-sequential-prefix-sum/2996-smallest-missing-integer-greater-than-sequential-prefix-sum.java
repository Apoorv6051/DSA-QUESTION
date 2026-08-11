class Solution {
    public int missingInteger(int[] nums) {
        // Step 1: find the sequential prefix and its sum
        int sum = nums[0];
        int j = 1;
        while (j < nums.length && nums[j] == nums[j - 1] + 1) {
            sum += nums[j];
            j++;
        }

        // Step 2: put all numbers into a HashSet for fast lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 3: starting from sum, find the first number NOT in the set
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}