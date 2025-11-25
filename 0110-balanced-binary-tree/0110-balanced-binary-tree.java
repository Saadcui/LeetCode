/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
  
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }


    private int checkHeight(TreeNode node) {
        // Base case: An empty tree has a height of 0 and is balanced.
        if (node == null) {
            return 0;
        }

        // 1. Check balance and get height of the left subtree
        int leftHeight = checkHeight(node.left);
        // If the left subtree is unbalanced, propagate the unbalanced signal immediately
        if (leftHeight == -1) {
            return -1;
        }

        // 2. Check balance and get height of the right subtree
        int rightHeight = checkHeight(node.right);
        // If the right subtree is unbalanced, propagate the unbalanced signal immediately
        if (rightHeight == -1) {
            return -1;
        }

        // 3. Check balance condition at the current node
        int heightDifference = Math.abs(leftHeight - rightHeight);
        if (heightDifference > 1) {
            return -1; // Current node is unbalanced
        }

        // 4. If balanced, return the actual height of the current subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }
}