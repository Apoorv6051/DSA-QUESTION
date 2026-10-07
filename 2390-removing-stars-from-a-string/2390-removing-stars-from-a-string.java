class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i =0; i < s.length(); i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));

            }else{
                char ch = s.charAt(i);
                if(ch == '*'){
                    st.pop();
                }
                else st.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();

        while(!st.isEmpty()){
            result.append(st.pop());

        }
        result.reverse();
        return result.toString();
        
    }
}