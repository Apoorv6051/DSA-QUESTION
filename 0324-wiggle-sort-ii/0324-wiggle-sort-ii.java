class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;

        // 1. Find median using QuickSelect
        int median = quickSelect(nums, n / 2);

        // 2. 3-way partition with virtual indexing
        int left = 0;
        int i = 0;
        int right = n - 1;

        while (i <= right) {

            int mappedI = newIndex(i, n);

            if (nums[mappedI] > median) {

                swap(nums, newIndex(left, n), mappedI);
                left++;
                i++;

            } else if (nums[mappedI] < median) {

                swap(nums, mappedI, newIndex(right, n));
                right--;

            } else {
                i++;
            }
        }
    }

    // Virtual indexing:
    // 0,1,2,3,4,5 -> 1,3,5,0,2,4
    private int newIndex(int i, int n) {
        return (1 + 2 * i) % (n | 1);
    }


    // QuickSelect
    private int quickSelect(int[] nums, int k) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int pivotIndex = partition(nums, left, right);

            if (pivotIndex == k) {
                return nums[pivotIndex];
            }

            if (pivotIndex < k) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }

        return -1;
    }


    // Lomuto partition
    private int partition(int[] nums, int left, int right) {

        int pivot = nums[right];
        int i = left;

        for (int j = left; j < right; j++) {

            if (nums[j] <= pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, right);

        return i;
    }


    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}