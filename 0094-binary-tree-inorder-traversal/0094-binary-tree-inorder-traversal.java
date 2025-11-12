class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // current is null here, so pop from stack
            current = stack.pop();
            result.add(current.val);

            // visit the right subtree
            current = current.right;
        }

        return result;
    }
}
