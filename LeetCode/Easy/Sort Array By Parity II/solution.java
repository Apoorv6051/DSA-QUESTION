class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even = (n+1)/2; 
        int odd = n/2;
        int[] res = new int[n];
       // string st = Arrays.toString(nums);// this will convert the nums in to string
       int j =0;
       int k =1;
        for(int i =0; i < n; i++){
            int curr = nums[i];
            if(curr % 2 ==0){  // if number is odd
                res[j] = nums[i];
                j=j+2;
            }else{
                res[k] = nums[i];
                k = k+2;
            }

            
        }
        return res;
        
    }
}