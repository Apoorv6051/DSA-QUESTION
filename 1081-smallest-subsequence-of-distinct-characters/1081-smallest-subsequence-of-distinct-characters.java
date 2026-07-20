import java.util.*;

class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        int last[] = new int[26]; // to keep track of last index of a character
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            last[ch - 'a'] = i;
        }

        Stack<Integer> st = new Stack<>();
        // creating hashset to keep track of char which is already added
        HashSet<Character> hset = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (hset.contains(ch)) continue;

            // pop while top of stack is greater than ch AND appears again later
            while (!st.isEmpty()) {
                char prev = s.charAt(st.peek());
                if (prev > ch && last[prev - 'a'] > i) {
                    st.pop();
                    hset.remove(prev);
                } else {
                    break;
                }
            }

            st.push(i);
            hset.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(s.charAt(st.pop()));
        }
        sb.reverse();
        return sb.toString();
    }
}