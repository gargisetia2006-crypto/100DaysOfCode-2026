class Solution {

    // Ye hamara data type hai jisme hum
    // height aur diameter dono return karenge
    class data {

        int height;
        int diameter;

        data(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public data findans(TreeNode root) {

        // Agar node null hai,
        // toh height aur diameter dono 0 honge
        if (root == null) {
            return new data(0, 0);
        }

        // Left subtree se uski height aur diameter mangwa rahe hain
        data left = findans(root.left);

        // Right subtree se uski height aur diameter mangwa rahe hain
        data right = findans(root.right);

        // Height of current root
        int height = 1 + Math.max(left.height, right.height);

        // Diameter passing through current root
        int currentDiameter = left.height + right.height;

        // Diameter 3 jagah ho sakta hai:
        // 1. Left subtree mein
        // 2. Right subtree mein
        // 3. Current root ke through

        int diameter = Math.max(
            currentDiameter,
            Math.max(left.diameter, right.diameter)
        );

        // Current subtree ki height aur diameter dono return karo
        return new data(height, diameter);
    }

    public int diameterOfBinaryTree(TreeNode root) {

        data ans = findans(root);

        return ans.diameter;
    }
}