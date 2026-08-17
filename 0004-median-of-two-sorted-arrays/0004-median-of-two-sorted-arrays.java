import java.util.*;

/*class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
         int n = nums1.length;
        int m = nums2.length;

        
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        
        Arrays.sort(merged);

        int total = merged.length;

        if (total % 2 == 1) {
           
            return (double) merged[total / 2];
        } else {
            
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        } */

        // two pointer

        class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int  n = nums2.length;
        int total = m + n;
        int midIndex1 = (total - 1) / 2;  
        int midIndex2 = total / 2; 

        int i = 0, j = 0, count = 0;
        int mid1 = 0, mid2 = 0;
        while (count <= midIndex2) {



            int val;
            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }
            if (count == midIndex1) mid1 = val;
            if (count == midIndex2) mid2 = val;
            count++;
        }
        return (total % 2 == 0) ? (mid1 + mid2) / 2.0 : mid2;
    }
}
    

