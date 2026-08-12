class Solution {
    public int[] rearrangeArray(int[] nums) {
        int index1 =0;
        int index2=0;
        int n = nums.length;
        // for storing the +ve number
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        for(int i  =0;i<n; i++){
            if(nums[i]>0){
                pos[index1]=nums[i];
                index1++;


            }else{
                neg[index2] = nums[i];
                index2++;
            }

        
        }
        // now placing them alternatiely
        int posIdx = 0;
        int negIdx = 0 ;

        for(int i  =0;i<nums.length;i+=2){
            nums[i] = pos[posIdx++];
            nums[i+1] = neg[negIdx++];
        }

        return nums;
    }
}