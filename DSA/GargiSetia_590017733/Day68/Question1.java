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
    List<Integer> list = new ArrayList<>();

   public TreeNode buildbst(int start , int end ){

    if (start > end) {
    return null;
    }

        int mid = (start + end )/ 2 ;
        TreeNode root = new TreeNode(list.get(mid));
        root.left  = buildbst(start  , mid -1 );
        root.right = buildbst( mid +1 , end );

    return root ; 
   }
    public void inorder( TreeNode root ){

        if(root == null){
            return ; 
        }

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public TreeNode balanceBST(TreeNode root) {

        inorder(root);
        TreeNode newRoot = buildbst(0, list.size() - 1);
return newRoot;

     
        
        
    }
}