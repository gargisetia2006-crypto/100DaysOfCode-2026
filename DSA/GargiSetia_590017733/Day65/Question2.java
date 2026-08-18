

public class Solution {
    public int closestValue(TreeNode root, double target) {

        int ans = root.val;

        while (root != null) {

            double currentDiff = Math.abs(root.val - target);
            double ansDiff = Math.abs(ans - target);

            if (currentDiff < ansDiff ||
                (currentDiff == ansDiff && root.val < ans)) {
                ans = root.val;
            }

            if (root.val == target) {
                return root.val;
            }

            if (root.val < target) {
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return ans;
    }
} {
    
}
