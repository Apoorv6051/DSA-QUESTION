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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double>  ans = new ArrayList<>();
        
        Queue<TreeNode> que = new ArrayDeque<>();

        if(root == null){
            return ans;

        }
        que.offer(root);

        while(!que.isEmpty()){

            int n = que.size();

            double sum =0;


            for(int  i =0; i < n ; i++){
                TreeNode temp = que.poll();
                sum += temp.val;
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);

                }
                double avg = sum/n;
                ans.add(avg);

            }
            return ans;

    }
}