class Solution {
    public int search(int[] nums, int target) {
        // brute force approach 
        // applying linear search in this question

        int n = nums.length;
        for(int i =0; i < nums.length; i++){
            if(nums[i] == target ){
                return i;
            }
        }
        return -1;
        
    }
}