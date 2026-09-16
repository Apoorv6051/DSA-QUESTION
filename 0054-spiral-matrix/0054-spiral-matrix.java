class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m= arr.length, n= arr[0].length;
        // spiral Printing 
         List<Integer> ans = new ArrayList<>();
        int minr=0, minc=0, maxr=m-1, maxc=n-1;
         while (minr<=maxr && minc<=maxc) { // CONDITION WHERE LOOP WILL BREAK
             // LEFT TO RIGHT (i-->  minc , j--> minc to maxc, minr++) 

             for(int j = minc; j <= maxc; j++){
                ans.add(arr[minr][j]); //phela min row ki value constant hogi
             }
               minr++; // to reduce the value of minr as printed row is no longer required
               if(minr>maxr || minc>maxc) break;

              // top to bottom  (j = maxc, i--> minr to maxr, maxc-- )

               for (int i = minr ; i <= maxr; i++) {
                ans.add(arr[i][maxc]);
                
               }
               maxc--; // to reduce the value of maxc as printed column is no longer required

                // right to left printing (i--> maxr,j--> maxc to minc, maxr--)
                if(minr>maxr || minc>maxc) break;

                for(int j =maxc; j>=minc; j--){
                    ans.add(arr[maxr][j]);
                }
                maxr-- ; // to reduce the value of maxr as printed row is no longer required

                 // bottom to top ( i--> maxr to minr, j--> minc , minc++)
                 if(minr>maxr || minc>maxc) break;
                  
                 for (int i = maxr; i >= minr; i--) {
                    ans.add(arr[i][minc]);
                    
                 }
                 minc++; // to reduce the value of minc as printed column is no longer required

            
         }
          return ans;
    }
   
}
    



        
