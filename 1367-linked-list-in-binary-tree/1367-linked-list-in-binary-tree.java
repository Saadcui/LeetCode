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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;

        // Try starting the linked list from this tree node
        if (dfs(head, root)) {
            return true;
        }

        // Try starting from left or right subtree
        return isSubPath(head, root.left) ||
               isSubPath(head, root.right);
    }

    private boolean dfs(ListNode head, TreeNode root) {
        // Entire linked list matched
        if (head == null) {
            return true;
        }

        // Tree path ended before list
        if (root == null) {
            return false;
        }

        // Values don't match
        if (head.val != root.val) {
            return false;
        }

        // Continue downward
        return dfs(head.next, root.left) ||
               dfs(head.next, root.right);
    }
}
