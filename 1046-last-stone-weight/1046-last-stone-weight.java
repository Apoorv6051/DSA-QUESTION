

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> arr = new ArrayList<>();
        
        for (int num : stones) {
            arr.add(num); // thsi is to add all element of array into arraylist
        }
        
        Collections.sort(arr); //sorting has been done in ascendind order
        
        while (arr.size() > 1) {
            int y = arr.remove(arr.size() - 1); // this will remove the last index and put in y
            int x = arr.remove(arr.size() - 1); // this will remove the last index and put it in x
            
            int diff = y - x;
            
            if (diff > 0) {
                arr.add(diff);
                Collections.sort(arr);
            }
        }
        
        return arr.isEmpty() ? 0 : arr.get(0);
    }
}