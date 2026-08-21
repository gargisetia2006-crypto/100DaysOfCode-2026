class Solution {

    class NodeValue {
        int minNode;
        int maxNode;
        int maxSize;

        NodeValue(int minNode, int maxNode, int maxSize) {
            this.minNode = minNode;
            this.maxNode = maxNode;
            this.maxSize = maxSize;
        }
    }

    public int largestBSTSubtree(TreeNode root) {
        return helper(root).maxSize;
    }

    public NodeValue helper(TreeNode root) {

        // Empty tree is a valid BST
        if (root == null) {
            return new NodeValue(
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                0
            );
        }

        NodeValue left = helper(root.left);
        NodeValue right = helper(root.right);

        // Check if current subtree is a BST
        if (left.maxNode < root.val && root.val < right.minNode) {

            return new NodeValue(
                Math.min(root.val, left.minNode),
                Math.max(root.val, right.maxNode),
                left.maxSize + right.maxSize + 1
            );
        }

        // Current subtree is NOT a BST
        return new NodeValue(
            Integer.MIN_VALUE,
            Integer.MAX_VALUE,
            Math.max(left.maxSize, right.maxSize)
        );
    }
}