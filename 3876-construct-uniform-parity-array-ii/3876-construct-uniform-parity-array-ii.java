class Solution {
    public boolean uniformArray(int[] a) {
        int n = a.length;
        int min = Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        int small = Arrays.stream(a).min().getAsInt();
        if(small % 2 !=0){
            return true;
        }
        for(int x:a){
            if(x % 2==1){
                return false;
            }
        }

        return true;
    }
}