class Solution {

    int count = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return count;
    }

    public void dfs(TreeNode root, int maxSoFar) {

        // Base case
        if (root == null) {
            return;
        }

        // Check whether current node is good
        if (root.val >= maxSoFar) {
            count++;

            // Update maximum
            maxSoFar = root.val;
        }

        // Go to left subtree
        dfs(root.left, maxSoFar);

        // Go to right subtree
        dfs(root.right, maxSoFar);
    }
}