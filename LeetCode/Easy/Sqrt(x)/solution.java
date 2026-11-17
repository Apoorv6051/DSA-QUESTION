class Solution {
    public int mySqrt(int n) {
        // solving this brute force
        // 2^2 = 4    here 4 (n) is given and 2 is "i" what we have to return
         int i;
         if(n ==2){
            return 1;
            
         }
         if(n ==0){
            return 0;
         }
         
        for(i =1; i< n ; ){
            if((long) i*i <= n){
                i++;

            }else{
                i--;
                break;
            }
            
         }
         return i;
    }
        
}
