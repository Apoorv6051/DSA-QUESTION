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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode result = lists[0];

        for (int i = 1; i < lists.length; i++) {
            result = mergeTwoList(result, lists[i]);
        }

        return result;
    }

    public ListNode mergeTwoList(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;

            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        // attach whichEver list has leftover nodes
        tail.next = (a != null) ? a : b;

        return dummy.next;
    }
}