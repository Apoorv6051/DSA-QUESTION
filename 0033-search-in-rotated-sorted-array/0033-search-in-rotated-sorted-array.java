class Solution {
    public int search(int[] nums, int target) {
        // // brute force approach 
        // // applying linear search in this question

        // int n = nums.length;
        // for(int i =0; i < nums.length; i++){
        //     if(nums[i] == target ){
        //         return i;
        //     }
        // }
        // return -1;

             // applying BINARY SEARCH NOW
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            // If target is found
            if (nums[mid] == target) {
                return mid;
            }

            // Now finding whether the left part
            // or the right part of mid is sorted

            if (nums[st] <= nums[mid]) {

                // If true, left part is sorted
                // Applying binary search in left part

                if (nums[st] <= target && target < nums[mid]) {

                    end = mid - 1;

                } else {

                    // Searching in right half
                    st = mid + 1;
                }

            } else {

                // Right part is sorted
                // Applying binary search in right part

                if (nums[mid] < target && target <= nums[end]) {

                    st = mid + 1;

                } else {

                    // Searching in left half
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
