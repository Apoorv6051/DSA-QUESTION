class Solution {
    public int myAtoi(String s) {
        s= s.trim();
        StringBuilder sb =new StringBuilder();
        int n = s.length();
        boolean flag = false;
        for(int i =0; i<n;i++){
            char ch =s.charAt(i);
            if((ch == 0) && flag == false ){
                continue;
            }
            if(ch=='-' && flag == false){
                sb.append(ch);
                flag = true;
                continue;
            }
            if(ch=='+' && flag == false){
                flag = true;
                continue;
            }
            flag=true;
            if(Character.isDigit(ch)){
                sb.append(ch);

            }
            else{
                break;
            }

        }

        if (sb.length()==0){
            return 0;
        }
        
        long res= stringToInt(sb.toString());
      

        return (int) res;
    }

    public static long stringToInt(String str) {
    long result = 0;
    boolean isNegative = false;
    int i = 0;

    // Handle sign
    if (str.charAt(0) == '-') {
        isNegative = true;
        i = 1;
    } else if (str.charAt(0) == '+') {
        i = 1;
    }

    // Build the number
    while (i < str.length()) {
        result = result * 10 + (str.charAt(i) - '0');
        // if(result < -2147483648)   return -2147483648;
        if(result > 2147483647) {
            return isNegative ? -2147483648 : 2147483647;
        }
        i++;
    }

    return isNegative ? -result : result;
}   
}