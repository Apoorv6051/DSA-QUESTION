class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixgcd = new int[n];
        int mx = 0;

        // Stage 1: build prefixGcd (this loop ONLY builds the array)
        for (int i = 0; i < n; i++) {
            mx = Math.max(nums[i], mx);
            int a = nums[i];
            int b = mx;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            prefixgcd[i] = a;
        }

        // Stage 2: sort — happens ONCE, after the array is fully built
        Arrays.sort(prefixgcd);

        // Stage 3: two-pointer pairing, sum GCD of every pair
        long totalSum = 0;
        int c = 0;
        int d = n - 1;
        while (c < d) {
            int a = prefixgcd[c];
            int b = prefixgcd[d];
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            totalSum += a;
            c++;
            d--;
        }

        return totalSum;
    }
}