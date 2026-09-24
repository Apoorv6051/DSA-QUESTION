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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> que = new ArrayDeque<>();

        que.offer(root); // adding value in queue
        int ans  = root.val;

        while(!que.isEmpty()){
            int n = que.size();

            for(int i = 0; i<n ; i++){
                TreeNode temp =que.poll();
                if(i == 0) ans = temp.val;
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null ) que.offer(temp.right);
            }
        }
        return ans;
        
    }
}