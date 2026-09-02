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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            // Connect current odd node to the next odd node
            odd.next = even.next;
            odd = odd.next;

            // Connect current even node to the next even node
            even.next = odd.next;
            even = even.next;
        }

        // Put the even list after the odd list
        odd.next = evenHead;

        return head;
    }
}
