class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] left = new int[n];// for storing product of till i 
        int[] ans = new int[n]; // for storing final answer
        left[0]=1;
        for(int i =1;i<n;i++){
        left[i] = left[i-1] * nums[i-1]; // bulding prefix product array

        }
        int right =1; // stores suffix product
        for(int i =n-1;i>=0;i--){
            ans[i]=left[i] * right;

            right *= nums[i];
        }
        return ans;


        
    }
}