class Solution {
    long MOD = 1_000_000_007; // 1. Added MOD

    // 2. Changed 'double' to 'long'
    long pow(long x, long n) { 
        if (n == 0) {
            return 1; // Changed 1.0 to 1
        }
        // Removed the (n < 0) block since n is always >= 0 here, 
        // and modular inverse cannot be done with 1 / pow(...)
        if (n % 2 == 0) {
            return pow((x * x) % MOD, n / 2); // 3. Added % MOD
        } else {
            return (x * pow((x * x) % MOD, (n - 1) / 2)) % MOD; // 3. Added % MOD
        }
    }

    public int countGoodNumbers(long n) {
        // 3 & 4. Added % MOD and cast final result to (int)
        return (int) ((pow(5, (n + 1) / 2) * pow(4, n / 2)) % MOD); 
    }
}
