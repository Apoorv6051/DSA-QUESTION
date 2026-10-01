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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> que = new ArrayDeque<>();
        que.offer(root);
        int level = 0;

        while (!que.isEmpty()) {
            int n = que.size();
            int prev = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                TreeNode temp = que.poll();

                if (level % 2 == 0) {
                    if (temp.val % 2 == 0 || temp.val <= prev) return false;
                } else {
                    if (temp.val % 2 != 0 || temp.val >= prev) return false;
                }
                prev = temp.val;

                if (temp.left != null) que.offer(temp.left);
                if (temp.right != null) que.offer(temp.right);
            }
            level++;
        }
        return true;
    }
}