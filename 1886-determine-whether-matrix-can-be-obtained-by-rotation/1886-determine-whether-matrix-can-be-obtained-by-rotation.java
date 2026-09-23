class Solution {
     public static void swap(int[][] mat,int i , int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;

    }
     static void reverse(int[][] mat ){
        for(int[] arr: mat){ // this will withdraw a 1d array from a 2d array
            int i =0;
            int j =arr.length -1;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
     }
     static boolean compare(int[][] mat,int[][] target){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]!=target[i][j]){
                    return false;

                }
            }

        }
        return true;
     }
    static void rotate(int[][] mat) {
        for(int i =0; i< mat.length; i++){
            for(int j =i+1 ; j<mat[0].length; j++){
                swap(mat, i ,j);
                 
            }
        }
        reverse(mat);
     }
    public boolean findRotation(int[][] mat, int[][] target) {
        int k = 4;
        while(k>0){
            rotate(mat);
            boolean a = compare(mat, target);
            if (a == true)  return true;
            k--;
        }
        return false;
    }
}