class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();

         for(int i =0; i <nums.length; i++){
            if(st.isEmpty()){
                st.push((long)nums[i]);
            }
                else{
                    long ele = nums[i];
                   while(!st.isEmpty() && st.peek()== ele){
                    st.pop();
                    ele= (long)ele*2;

                   }
                   st.push(ele);
                }
            
         }
         List<Long> result = new ArrayList<>();

         while(!st.isEmpty()){
            result.add(st.pop());
         }
         Collections.reverse(result);
         return result;
        
    }
}