class Solution {
    public int[] sortArrayByParityII(int[] nums) {
    //     int n = nums.length;
    //     int[] res = new int[n];
    //    // string st = Arrays.toString(nums);// this will convert the nums in to string
    //    int j =0;
    //    int k =1;
    //     for(int i =0; i < n; i++){
    //         int curr = nums[i];
    //         if(curr % 2 ==0){  // if number is odd
    //             res[j] = nums[i];
    //             j=j+2;
    //         }else{
    //             res[k] = nums[i];
    //             k = k+2;
    //         }
            
            
    //     }
    //     return res;
        

    //                applying optimal aproach by in place swapping

      int n = nums.length;
        int even = 0;
        int odd = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                // Only swap if this even number hasn't already been placed
                if (i % 2 == 1 || i >= even) {
                    int temp = nums[even];
                    nums[even] = nums[i];
                    nums[i] = temp;

                    if (i > even) i--; // Re-check the new number brought to index i
                    even = even + 2;
                }
            } else {
                // Only swap if this odd number hasn't already been placed
                if (i % 2 == 0 || i >= odd) {
                    int temp = nums[odd];
                    nums[odd] = nums[i];
                    nums[i] = temp;

                    if (i > odd) i--; // Re-check the new number brought to index i
                    odd = odd + 2;
                }
            }
        }

        return nums;
    }
    }
