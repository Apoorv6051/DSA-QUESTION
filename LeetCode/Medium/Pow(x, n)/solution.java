class Solution {
    public double myPow(double x, int n) {

        long N = Math.abs((long)n);

        double ans = 1;

        while(N > 0) {

            // If exponent is odd
            if(N % 2 == 1) {
                ans = ans * x;
            }

            // Square the base
            x = x * x;

            // Divide exponent by 2
            N = N / 2;
        }

        // Handle negative exponent
        return n < 0 ? 1 / ans : ans;
    }
}