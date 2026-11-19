//       recursion + memosiation 

//class Solution {
//     int[][] dp;
//     private int solve(int i, int j , String text1, String text2){
//         if(i == 0 || j == 0){
//             return dp[i][j]=0;
//         }

//         if(dp[i][j] != -1) return dp[i][j];

//         if(text1.charAt(i-1) == text2.charAt(j-1)){
//             return dp[i][j] = 1+ solve(i-1 , j-1, text1, text2);
//         }else{
//             return dp[i][j] = Math.max(solve(i-1,j,text1,text2), solve(i, j-1,text1, text2 ));


//         }
//     }
//     public int longestCommonSubsequence(String text1, String text2) {
//         // we are going to solve this with dp(dynamic programming)
//         int i =text1.length();
//         int j = text2.length();

//         dp = new int[i+1][j+1];
//         for(int[] arr: dp){
//             Arrays.fill(arr,-1);
//         }
//         return solve(i,j, text1,text2);
        
        
//     }
// }

//                  tabulation method part of dp with ina optimised (without recursion)

class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(); 
        int m = text2.length(); 
        
        int[][] dp = new int[n+1][m+1]; 

        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0; 
        }

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; 
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1]; 
                }
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]); 
            }
        }

        return dp[n][m];
    }
}
