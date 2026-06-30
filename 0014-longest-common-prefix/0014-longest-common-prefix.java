class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
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

        return first;
    }
}