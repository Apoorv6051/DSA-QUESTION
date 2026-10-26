class Solution {
    public boolean isIsomorphic(String s, String t) {
         
         char[] a = new char[128]; // default value in this case "\0"
        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i); // ch is mapping on dh
            char dh = t.charAt(i);
             int idx =(int)ch; // type casting
             if (a[idx]=='\0') a[idx] = dh;
             else{
                if (a[idx]!=dh) return false ;
                    
                }
             }
               char[] b = new char[128]; // default value in this case "\0"
        for (int i = 0; i < t.length(); i++) {
            char ch= t.charAt(i); // ch is mapping on dh
            char dh = s.charAt(i);
             int idx =(int)ch; // type casting
             if (b[idx]=='\0') b[idx] = dh;
             else{
                if (b[idx]!=dh) return false ;
                    
                }
             }
             return true;
    

                
             }

        
    }
