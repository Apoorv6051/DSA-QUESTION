class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        for(int k: mp.keySet())
        {
            if(mp.get(k) == 1){
                return k;
            }

        }
        return 0;
           }
}