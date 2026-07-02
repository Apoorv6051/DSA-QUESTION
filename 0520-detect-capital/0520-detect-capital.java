class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        int uppercase=0;
        for(int i =0;i<len;i++){
            if(Character.isUpperCase(word.charAt(i))){   // this iis to count number of UPPERCASE
                uppercase++;
            }
        }
        if(uppercase == len|| uppercase == 0 ||( uppercase == 1 && Character.isUpperCase(word.charAt(0)))){

        return true;
        }
        else{
            return false;
        }


        
    }
}