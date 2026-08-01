class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0;
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
               
                }
                else{
                    count =0;
                }
            
            a=Math.max(a,count);
        }
        return a;
        
    }
}