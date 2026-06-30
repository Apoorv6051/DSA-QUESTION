
  import java.util.Arrays;
   class Solution {
    public String longestCommonPrefix(String[] strs) {
       /*  if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];

        for (int j = 0; j < first.length(); j++) {
            char c = first.charAt(j);

            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != c) {
                    return first.substring(0, j);
                }
            }
        }

        return first; */

        // sorting the array
     

        if (strs == null || strs.length == 0) {
            return "";
        }

        // sorting the array
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int indx = 0;

        while (indx < s1.length() && indx < s2.length()) {
            if (s1.charAt(indx) == s2.charAt(indx)) {
                indx++;
            } else {
                break;
            }
        }

        return indx == 0 ? "" : s1.substring(0, indx);
    }
}