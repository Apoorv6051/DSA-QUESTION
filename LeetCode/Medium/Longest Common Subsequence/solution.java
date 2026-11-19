class Solution {
    int[][] dp;
    private int solve(int i, int j , String text1, String text2){
        if(i == 0 || j == 0){
            return dp[i][j]=0;
        }

        if(dp[i][j] != -1) return dp[i][j];

        if(text1.charAt(i-1) == text2.charAt(j-1)){
            return dp[i][j] = 1+ solve(i-1 , j-1, text1, text2);
        }else{
            return dp[i][j] = Math.max(solve(i-1,j,text1,text2), solve(i, j-1,text1, text2 ));


        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        // we are going to solve this with dp(dynamic programming)
        int i =text1.length();
        int j = text2.length();

        dp = new int[i+1][j+1];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        return solve(i,j, text1,text2);
        
        
    }
}