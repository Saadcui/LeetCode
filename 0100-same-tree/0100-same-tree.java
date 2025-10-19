class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Case 1: both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // Case 2: one of the nodes is null
        if (p == null || q == null) {
            return false;
        }

        // Case 3: both nodes are not null, compare values and recurse
        if (p.val != q.val) {
            return false;
        }

        // Recursively compare left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
