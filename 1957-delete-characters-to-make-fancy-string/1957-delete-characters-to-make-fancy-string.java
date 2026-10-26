class Solution {
    public String makeFancyString(String s) {
    //     StringBuilder sb = new StringBuilder(s); // this will store the string in stringBuilder
    //     int i =2; // Start from index 2 because we need to check three characters
    //     while(i < sb.length()){
    //         if(sb.charAt(i) == sb.charAt(i-1) && sb.charAt(i) == sb.charAt(i-2)){ // AND me jb dono condition true hoti h tabhi final true aaata h
    //         sb.deleteCharAt(i);

                
    //     } else {
    //         i++;                        complexity =O(n^2)
    //     }

        
    // }
    // return sb.toString(); // this will convert stringBuilder back into string

      


            // now this solutionn has complexity O(n)


     StringBuilder sb = new StringBuilder();
     for(int i =0; i < s.length(); i++){
        char ch = s.charAt(i);
        int len = sb.length();
            if(len>=2
            && sb.charAt(len-1)==ch
            && sb.charAt(len-2)== ch){
                continue;
            }
            sb.append(ch); // adds data to the StringBuilder
     }
     return sb.toString();

}
}