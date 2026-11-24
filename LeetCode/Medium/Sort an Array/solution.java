// class Solution {
//     public int[] sortArray(int[] nums) {
//         Arrays.sort(nums);
//         return nums;
//     }
// }
      
class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int low, int high) {

        // Base condition
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Divide the array into two halves
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        // Merge both sorted halves
        merge(nums, low, mid, high);
    }

    private void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy remaining elements from right half
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // Copy merged elements back into original array
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }
}
