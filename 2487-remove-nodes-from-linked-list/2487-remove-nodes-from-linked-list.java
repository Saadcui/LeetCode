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
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // First process nodes to the right
        head.next = removeNodes(head.next);

        // If the next node has a greater value, remove current node
        if (head.next != null && head.next.val > head.val) {
            return head.next;
        }

        return head;
    }
}
