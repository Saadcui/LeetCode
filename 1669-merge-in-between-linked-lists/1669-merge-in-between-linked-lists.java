class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // Find the node before index a
        ListNode beforeA = list1;
        for (int i = 0; i < a - 1; i++) {
            beforeA = beforeA.next;
        }

        // Find the node at index b
        ListNode atB = list1;
        for (int i = 0; i < b; i++) {
            atB = atB.next;
        }

        // Connect the node before a to the head of list2
        beforeA.next = list2;

        // Find the last node of list2
        ListNode last2 = list2;
        while (last2.next != null) {
            last2 = last2.next;
        }

        // Connect the end of list2 to the node after b
        last2.next = atB.next;

        return list1;
    }
}