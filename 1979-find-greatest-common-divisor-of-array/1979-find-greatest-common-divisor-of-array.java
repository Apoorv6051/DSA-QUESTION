class Solution {
    public int findGCD(int[] nums) {
        // BRUTE FORCE SOLUTION OF THIS
        int max=0;
        int min =nums[0];
        int a ,b;
        int n= nums.length;
        for(int i =0;i<n;i++){
        max=Math.max(max,nums[i]);
        min = Math.min(min,nums[i]);
        }
        // APPLYING EUCLIDEAN ALGO
    a=max;
    b=min;
    while(b!=0){
        int temp =b;
        b = a % b;
        a=temp;

    }


        return a;
    }
}