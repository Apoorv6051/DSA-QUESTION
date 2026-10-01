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
    int ans =0;
    private void dfs(TreeNode root , int left, int right){
        if(root == null ) {
            return;

        }
        ans = Math.max(ans,Math.max(left,right));

        dfs(root.left,right+1,0);
        dfs(root.right,0,left+1);

    }

    public int longestZigZag(TreeNode root) {
        dfs(root,0,0);

        return ans;
        /* int ans = 0;
        Stack<Triplet> stack = new Stack<>();
        stack.push(new Triplet(root, 0, null));
        while (!stack.isEmpty()) {
            Triplet triplet = stack.pop();
            TreeNode node = triplet.node;
            int n = triplet.n;
            Integer left = triplet.left;
            if (node != null) {
                ans = Math.max(ans, n);
                stack.push(new Triplet(node.left, left != null && left == 0 ? n + 1 : 1, 1));
                stack.push(new Triplet(node.right, left != null && left == 1 ? n + 1 : 1, 0));
            }
        }
        return ans;
    }
}

class Triplet {
    TreeNode node;
    int n;
    Integer left;
    
    public Triplet(TreeNode node, int n, Integer left) {
        this.node = node;
        this.n = n;
        this.left = left; */

    }
}