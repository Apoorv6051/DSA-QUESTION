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
    // first we are finding INORDER
    List<Integer> nums = new ArrayList<>();
    public  void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left); // LNR
        nums.add(root.val);
        inorder(root.right);

        
    }
    public TreeNode build(int l , int r){
        if(l>r) return null;

        int mid = l +(r-l)/2;

        TreeNode root = new TreeNode(nums.get(mid)); // making a new root as a mid element of array

        root.left = build(l,mid-1);
        root.right = build(mid+1, r);

        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build (0,nums.size()-1);
        
        
    }
}