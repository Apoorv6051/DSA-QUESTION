class Solution {
    public int findPeakElement(int[] nums) {
        // // trying brute force in it 
        // int mx = Integer.MIN_VALUE;
        // int idx = 0;


        // for(int i=0; i <nums.length;i++){
        //     if(nums[i]> mx){

            
        //      mx = Math.max(mx,nums[i]);
        //       idx =  i;
        //     }
        // }
        // return idx;

                  // now solving this using binary search because it will give required complexity which is O(log n)
                  // curenty it has a complexity of O(n)
        


        int st =0;
        int en = nums.length-1;
        while(st < en){
            int mid = st +(en - st)/2;
            if(nums[mid] < nums[mid+1]){
                st = mid +1;
            }else{
                en = mid;
            }
            
        }
        return st;
    }
}