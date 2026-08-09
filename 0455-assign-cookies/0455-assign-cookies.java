class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(s);
        Arrays.sort(g);

        int count = 0;

        int i =0,j=0;
        int m = g.length;
        int n = s.length;


        while(i<m && j<n){
            if(s[j]>=g[i]){
                count++;
                i++;

            }
            j++;
        }

        return count;  
    }
}