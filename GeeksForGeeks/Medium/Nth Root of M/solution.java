class Solution {
    public int nthRoot(int n, int m) {
        if (m == 0) return 0;
        if (m == 1 || n == 1) return m;

        long st = 1;
        long en = (long) Math.sqrt(m) + 1;

        while (st <= en) {
            long mid = st + (en - st) / 2;
            double num = Math.pow(mid, n);

            if (num == m) {
                return (int) mid;
            } else if (num < m) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }
        return -1;
    }
}
