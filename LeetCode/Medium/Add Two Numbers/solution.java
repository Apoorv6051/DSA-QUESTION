
class Solution {
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {

        ListNode list = new ListNode(); // Dummy node
        ListNode temp = list;

        ListNode temp1 = head1;
        ListNode temp2 = head2;

        int carry = 0;

        while (temp1 != null || temp2 != null || carry != 0) {

            int val1 = (temp1 != null) ? temp1.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;

            int sum = val1 + val2 + carry;

            int rem = sum % 10;
            carry = sum / 10;

            ListNode t = new ListNode(rem);

            temp.next = t;
            temp = temp.next;

            // Move pointers only if they are not null
            if (temp1 != null) {
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }

        return list.next;
    }
}
