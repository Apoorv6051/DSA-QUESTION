class Solution {
    public int[] plusOne(int[] arr) {
    int i = arr.length-1;
    while(i>=0){
        if(arr[i]<9){
            arr[i]=arr[i]+1;
            break;
        }
        if(arr[i]==9){
            arr[i]=0;

        }
        i--;
      
    }
   // i == -1 that means the loop nvr hit the break here all the element is 9 
   if(i == -1){
    int[] res =new int[arr.length+1];
    res[0]=1;
    // now copying all the element of arr into res
    for(int j =1;j<res.length;j++){
        res[j]=arr[j-1];

    }

    return res;
   }
   return arr;

    }
    }
