class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            int min= Integer.MAX_VALUE;
            max= Math.max(max,nums[i]);// this will find th max value form 0th index last index of array but one by one 
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]); // this will again find the smallest element from i th index to last element of array

            }
            int score = max-min;
            if(score<=k){
                ans=Math.min(ans,i);

            }

        }
         if(ans==2147483647) return -1;
        return ans;
       
    }
}