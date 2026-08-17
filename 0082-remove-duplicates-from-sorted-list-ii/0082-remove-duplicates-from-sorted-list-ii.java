class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // If curr is the start of a duplicate group
            if (curr.next != null && curr.val == curr.next.val) {
                int duplicate = curr.val;

                // Skip every node with this value
                while (curr != null && curr.val == duplicate) {
                    curr = curr.next;
                }

                // Connect the previous distinct node to the next distinct node
                prev.next = curr;
            } else {
                // curr is unique, so move prev forward
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}