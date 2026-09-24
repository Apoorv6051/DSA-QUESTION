/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>>  ans = new ArrayList<>();
        
        Queue<TreeNode> que = new ArrayDeque<>();

        if(root == null){
            return ans;

        }
        que.offer(root);

        while(!que.isEmpty()){

            int n = que.size();

            List<Integer> arr = new ArrayList<>();

            for(int  i =0; i < n ; i++){
                TreeNode temp = que.poll();
                arr.add(temp.val);
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);

                }
                ans.add(arr);

            }

            Collections.reverse(ans);
            return ans;
        
    }
}