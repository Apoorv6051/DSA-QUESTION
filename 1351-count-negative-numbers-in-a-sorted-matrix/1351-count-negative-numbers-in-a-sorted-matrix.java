class Solution {
    public int countNegatives(int[][] grid) {
        // int neg =0;
        // int m = grid[0].length;
        // for(int i =0 ; i<grid.length;i++){
        //     for(int j =0;j<m;j++){
        //         if(grid[i][j]<0){
        //             neg++;
        //         }
        //     }
        // }
        // return neg;
        

        // applying stare Case method

        int m = grid.length;
        int n = grid[0].length;
        int i =m -1, j =0;;

        int res =0;

        while(i >=0 && j <n){
            if(grid[i][j] <0){
                res += n -j;
                i--;
            }else{
                j++;
            }
           
        }

         return res;
    }
}