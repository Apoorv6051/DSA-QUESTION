class Solution {
    public int maxProduct(int n) {
        
        int temp = n;
        int max=0;
        int len = 0;
        while (temp != 0) {
            len++;
            temp = temp / 10;
        }

        int[] arr = new int[len];
        int i = 0;
        while (n != 0) {
            int b = n % 10;
            n = n / 10;
            arr[i] = b;
            i++;
        }
        for(int j =0;j<arr.length;j++){
            for(int k=j+1;k<arr.length; k++){
               int mu =arr[j]*arr[k];
                max= Math.max(max,mu);

            }
        }
        return max;

       
    }
}