class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int st = 0;
        int en = arr.length-1;
        while(st < en){
            int mid = st +(en - st)/2;
             if(arr[mid] < arr[en]){
                 en = mid;
             }else{
                 st = mid + 1;
             }
        }
        return st; // this will return the index 
    }
}