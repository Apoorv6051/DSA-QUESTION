class Solution {
    public int findPeakElement(int[] nums) {
        // trying brute force in it 
        int mx = Integer.MIN_VALUE;
        int idx = 0;


        for(int i=0; i <nums.length;i++){
            if(nums[i]> mx){

            
             mx = Math.max(mx,nums[i]);
              idx =  i;
            }
        }
        return idx;
        
    }
}