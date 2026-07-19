class Solution {
    public int lengthOfLongestSubstring(String s) {
       /*  int a= s.length();
        char b;
        HashSet<Character> set = new HashSet <>();

        for(int i=0; i<a ;i++){
             b = s.charAt(i);
             boolean f = set.contains(b);
        if(f==false){
            set.add(b);
        }

        }
         
        return set.size();
         */
          int start =0;
          int end=0;
          int max_len=0;
          List <Character> list = new ArrayList<>();
          while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_len=Math.max(max_len,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
          }

             return max_len;
        
    }
}