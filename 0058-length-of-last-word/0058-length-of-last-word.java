class Solution {
    public int lengthOfLastWord(String s) {
        String a =s.trim();
        int count =0;

        char[] arr = a.toCharArray();
    /* for(int i =0;i<a.length();i++){
        System.out.print(arr[i]);

    } */
    for (int i = arr.length-1 ; i >= 0; i--) {
    if (arr[i] == ' ') {
       
      break;
    }
     count++;
}

  return count;
    }
}