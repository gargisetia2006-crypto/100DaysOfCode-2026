/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCompleteTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean found = false ; 

        while(!q.isEmpty()){
            TreeNode curr = q.poll();

            if ( curr == null ){
                found  = true ; 
                continue ; 

            }

        // if curr node is not null we need to check if it saw any null in past 
        if (found){
            return false ; 
        }

   q.offer(curr.left);
            q.offer(curr.right);
        }

        
        return true ; 
    }
}

           