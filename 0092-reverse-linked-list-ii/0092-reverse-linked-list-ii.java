class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Dummy node handles the case where left == 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev to the node just before position left
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // curr is the first node of the section to reverse
        ListNode curr = prev.next;

        // Move nodes one by one to the front of the reversed section
        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;

            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}