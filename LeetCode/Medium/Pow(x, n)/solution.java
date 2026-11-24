// class Solution {
//     public double myPow(double x, int n) {
//         if(n < 0){
//             x = 1/x;
//             n = -n;
//         }           this is the brute force which shows TLE
//          double ans = 1.0;
//         for(int i =0; i <n ; i++){
//             ans *= x;
//         }
//         return ans;
//     }
// }

class Solution {

    double solve(double x, long n){
        if(n == 0){
            return 1.0;
        }
        if(n < 0){
            return 1/solve(x, n * -1);
        }
        if(n % 2 ==0){
            return solve(x*x , n/2);
        }else{
            return x * solve(x*x,(n-1)/2);
        }
    }
    public double myPow(double x, int n) {
        return solve(x,(long)n);
    }
}