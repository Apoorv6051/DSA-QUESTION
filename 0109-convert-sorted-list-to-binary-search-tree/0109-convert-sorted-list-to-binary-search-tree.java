/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode build(List<Integer> ele , int s, int e){
        if(s>e){
            return null;
        }
        int mid = s+(e-s)/2;
        TreeNode root = new TreeNode(ele.get(mid)); // tsking middle element as node
        root.left = build(ele,s,mid-1);
        root.right=build(ele,mid+1,e);

        return root;

    }
    public TreeNode sortedListToBST(ListNode head) {// putting value of linked lisst to arrayList
        List<Integer> ele = new ArrayList<>();
        while(head != null){
            ele.add(head.val);
            head = head.next;
        }
        return build(ele,0,ele.size()-1);

        
        
    }
}