class Solution {
    public boolean isPerfectSquare(int n) {
      // trying brute force on this
       long  st =1;
       long en = n/2+1;
       if( n == 1){
        return true;
       }

       while(st <= en){

        long mid = st + (en - st)/2;
        if( mid * mid == n ){
            return true;
        }
        if(mid * mid < n){
            st = mid + 1;
        }else{
            en = mid - 1;
        }
        
       }
       return false;
    }
}