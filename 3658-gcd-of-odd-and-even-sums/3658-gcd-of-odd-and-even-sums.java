class Solution {
    public int gcdOfOddEvenSums(int n) {
       int evenSum =((n*n)+n);
       int  oddsum = (n*n); 

       // after that we will use Euclidean algorithm to find gcd
       int b= evenSum;
       int a =oddsum;
       while(b !=0){
        int temp = b;
        b= a % b;
        a= temp;

       }
       return a;

       
    }
}
