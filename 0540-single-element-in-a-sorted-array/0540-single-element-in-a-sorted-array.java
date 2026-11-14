class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Map<Integer,Integer> mp = new HashMap<>();
        // for(int x: nums){
        //     mp.put(x, mp.getOrDefault(x, 0) + 1);
        // }
        // for(int k: mp.keySet())
        // {
        //     if(mp.get(k) == 1){
        //         return k;
        //     }

        // }

        int st = 0;
        int end = nums.length-1;
        while(st < end){
            int mid = st+(end - st)/2;
            if(nums[mid]== nums[mid^1]){

                st =  mid + 1;
            }else{
                end = mid;


            }

        }
        return nums[st];
        
           }
}