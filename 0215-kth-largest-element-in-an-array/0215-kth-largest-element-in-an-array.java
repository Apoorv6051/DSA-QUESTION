/* class Solution {
    public int findKthLargest(int[] nums, int k) { 
        Arrays.sort(nums);
        int n= nums.length;
        return nums[n-k];
        
        
    }
} */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();        
    }
}