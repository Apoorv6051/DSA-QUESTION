class Solution {
    public int climbStairs(int n) {
        if(n<3) return n;
        int a=1;
        int b=2;
        int count=2;
        return _fibonacci(n,count,a,b);
    }
    private int _fibonacci(int n,int count, int a, int b) {
        if(count!=n) {
            int temp=a;
            a=b;
            b=temp+b;
            ++count;
            int value=_fibonacci(n,count,a,b);
            if(value==0) return b;
            else return value;
        }
        return 0;
    }
}