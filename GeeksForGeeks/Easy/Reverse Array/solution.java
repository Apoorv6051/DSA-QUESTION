class Solution {
   void reverse(int arr[], int start, int end) {
       if(start >= end ){
           return;
       }
       int temp =arr[start];
       arr[start]=arr[end];
       arr[end]= temp;
       
       // now the recursive call
       reverse(arr, start+1, end -1);
       
   }
    public void reverseArray(int arr[]) {
        // code here
        // firstly trying brute force on this 
        // int[] ans = new int[arr.length];
        // int  j=0;
        
        // for(int i = arr.length-1; i >=0; i--){
            
           
        //         ans[j] = arr[i];
        //         j++;
            
        // }
        // for(int i =0; i <arr.length; i++){
        //     arr[i] = ans[i];
        // }
        
        
        //      now tring this with recursion
   
         reverse(arr, 0, arr.length - 1);
     
      }
    }
