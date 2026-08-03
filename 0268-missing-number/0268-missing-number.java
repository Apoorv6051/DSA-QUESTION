class Solution {
    public int missingNumber(int[] nums) {
        /* int n= nums.length;
        int c=0;

        int count=0;
        int i=0;
        while(i<n){
            if(nums[i]==count){
                count++;
                if(count==n) break;
            }
            if (nums[i]!=count){
                c=count;
            }
        }
         return c; */
         int n=nums.length;
         int sum =0;
         


         int a=(n*(n+1))/2;
         for(int i=0;i<n;i++){
            sum=sum+nums[i];
            
            
         }
         return (a-sum);
    }
}