class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s); // this will store the string in stringBuilder
        int i =2; // Start from index 2 because we need to check three characters
        while(i < sb.length()){
            if(sb.charAt(i) == sb.charAt(i-1) && sb.charAt(i) == sb.charAt(i-2)){ // AND me jb dono condition true hoti h tabhi final true aaata h
            sb.deleteCharAt(i);

                
        } else {
            i++;
        }

        
    }
    return sb.toString(); // this will convert stringBuilder back into string
}
}