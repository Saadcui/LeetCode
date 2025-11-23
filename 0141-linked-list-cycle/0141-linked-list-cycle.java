public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move slow by 1
            fast = fast.next.next;      // move fast by 2

            if (slow == fast) {         // cycle found
                return true;
            }
        }

        return false; 
    }
}
