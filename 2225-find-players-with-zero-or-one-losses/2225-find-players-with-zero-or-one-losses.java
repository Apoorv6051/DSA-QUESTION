class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> zero = new ArrayList<>();
        List <Integer> ones = new ArrayList<>();

        Map<Integer,Integer > mp = new HashMap<>();
        for(int[] temp : matches){
            mp.put(temp[0],mp.getOrDefault(temp[0],0));
            mp.put(temp[1],mp.getOrDefault(temp[1],0)+1);

        } 
        for(int i: mp.keySet()){
            if(mp.get(i)==0){
            zero.add(i);
           }
           else if (mp.get(i)==1){
            ones.add(i);
           }
        }


        Collections.sort(zero);
        Collections.sort(ones);

        return Arrays.asList(zero, ones);
    }
    
}