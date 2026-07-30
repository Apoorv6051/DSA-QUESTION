class Solution {
    public int maxArea(int[] height) {
        /* int mx = Integer.MIN_VALUE;
        int n = height.length;
       // WE ARE USING TWO POINTER AS BRUTEFORCE TO FIND MAXIMUM WATER UPHOLD
       for(int i =0; i<n; i++){
        for(int j =i+1;j<n;j++){
            int width = j-i;
            int min=Math.min(height[i],height[j]);
            int rewa=min * width;
             mx = Math.max(mx,rewa);

        }
       }                                 // brute force says TIME LIMIT EXCEEDED
       
        return mx; */

        int n = height.length;
        int maxWater=0;
        int lp=0;
        int rp=n-1;
        while(lp<rp){

            int width =rp-lp;
           int ht=Math.min(height[lp],height[rp]);
            int curwat = width*ht;
            maxWater =Math.max(maxWater,curwat);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        
      return maxWater;
        
    }
}