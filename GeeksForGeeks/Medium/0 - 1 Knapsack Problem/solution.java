
class Solution {

    // DP array for memoization
    static int[][] dp = new int[1001][1001];

    private int solve(int[] wt, int[] val, int W, int size) {

        // Base condition
        if (size == 0 || W == 0) {
            return 0;
        }

        // If already calculated, return stored answer
        if (dp[size][W] != -1) {
            return dp[size][W];
        }

        // If current item's weight is less than or equal to capacity
        if (wt[size - 1] <= W) {

            // Two choices: Include or Exclude current item
            return dp[size][W] = Math.max(
                val[size - 1] + solve(wt, val, W - wt[size - 1], size - 1),
                solve(wt, val, W, size - 1)
            );
        }

        // If current item cannot fit, exclude it
        else {
            return dp[size][W] = solve(wt, val, W, size - 1);
        }
    }

    public int knapsack(int W, int val[], int wt[]) {

        int size = wt.length;

        // Initialize DP array with -1
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(wt, val, W, size);
    }
}
