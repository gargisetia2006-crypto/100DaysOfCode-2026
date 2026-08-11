class Solution {

    public boolean getPath(TreeNode root, TreeNode target,
                           ArrayList<TreeNode> path) {

        // root null
        if (root == null) {
            return false;
        }

        // root is the target
        if (root == target) {
            path.add(root);
            return true;
        }

        // If either child finds the target
        if (getPath(root.left, target, path) ||
            getPath(root.right, target, path)) {

            path.add(root);
            return true;
        }

        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode p,
                                         TreeNode q) {

        ArrayList<TreeNode> pathp = new ArrayList<>();
        ArrayList<TreeNode> pathq = new ArrayList<>();

        getPath(root, p, pathp);
        getPath(root, q, pathq);

        // Paths are target -> root
        for (int i = 0; i < pathp.size(); i++) {

            if (pathq.contains(pathp.get(i))) {
                return pathp.get(i);
            }
        }

        return null;
    }
}