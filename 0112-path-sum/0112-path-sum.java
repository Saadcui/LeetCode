class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: empty tree
        if (root == null) {
            return false;
        }

        // If this is a leaf node, check if the path sum matches
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Recurse on left and right subtrees
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) ||
               hasPathSum(root.right, remainingSum);
    }
}
