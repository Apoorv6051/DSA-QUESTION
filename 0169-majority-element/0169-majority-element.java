class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i  =0 ;i<nums.length;i++){
            int  num = nums[i];
            // checking if mao contain that element;
            if(map.containsKey(num)){
                int currentCount =map.get(num);
                map.put(num,currentCount +1);
            }else{
                map.put(num,1);
            }
        }
            for(int key: map.keySet()){
                if(map.get(key)> n/2){
                    return key;
                }
            }
             return -1;
    }
}