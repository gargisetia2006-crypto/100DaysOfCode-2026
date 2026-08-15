class Solution {

    public int maxRobbery(int n, int[] tree) {
        int[] dp = new int[n];

        return solve(0, tree, dp);
    }

    private int solve(int i, int[] tree, int[] dp) {

        // Node doesn't exist
        if (i >= tree.length || tree[i] == -1) {
            return 0;
        }

        // Already calculated
        if (dp[i] != 0) {
            return dp[i];
        }

        // If we rob current house
        int rob = tree[i];

        // Grandchildren
        if (2 * i + 1 < tree.length) {
            rob += solve(4 * i + 3, tree, dp); // left-left
            rob += solve(4 * i + 4, tree, dp); // left-right
        }

        if (2 * i + 2 < tree.length) {
            rob += solve(4 * i + 5, tree, dp); // right-left
            rob += solve(4 * i + 6, tree, dp); // right-right
        }

        // If we don't rob current house
        int notRob = 0;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < tree.length) {
            notRob += solve(left, tree, dp);
        }

        if (right < tree.length) {
            notRob += solve(right, tree, dp);
        }

        // Best choice
        dp[i] = Math.max(rob, notRob);

        return dp[i];
    }
}