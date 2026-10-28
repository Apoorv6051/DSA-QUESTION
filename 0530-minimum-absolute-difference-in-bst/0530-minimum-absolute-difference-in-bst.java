
class Solution {
    
    int min = Integer.MAX_VALUE;

    
    Integer prev = null;

    public int getMiniDiff(TreeNode root) {
        
        if (root == null) {
            return min;
        }

        
        getMiniDiff(root.left);

        
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }

        
        prev = root.val;

        
        getMiniDiff(root.right);

        return min;
    }

    public int getMinimumDifference(TreeNode root) {
        
        return getMiniDiff(root);
    }
}
