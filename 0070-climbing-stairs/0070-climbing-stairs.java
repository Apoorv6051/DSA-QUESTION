class Solution {
    // int[] memo;
    // private int solve(int n){
    //     if(n == 0 || n == 1){
    //         return memo[n]=1;
    //     }
    //     if(memo[n] != -1) return memo[n];

    //     return memo[n]= solve(n-1) + solve(n-2);
    // }
    // public int climbStairs(int n) {
        
    //     memo = new int[n+1];
    //     Arrays.fill(memo,-1) ;
    //     return solve(n);
        
    // }
            // now applying bottom up approach
            // applying dp
     public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] =1;

        for(int i =2;i <=n ; i++){
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }
}