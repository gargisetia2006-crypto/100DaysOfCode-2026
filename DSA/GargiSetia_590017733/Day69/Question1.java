class Solution {
    public TreeNode buildbst(int[] preorder , int start , int end ){
        if ( start > end ){
            return null ; 
        }

        TreeNode root = new TreeNode(preorder[start]);
        int split = start+1 ; 

        while( split <=end && preorder[split] < root.val){
            split++;
        }

        root.left = buildbst(preorder , start+1 , split-1);
        root.right = buildbst(preorder , split , end );
        return root ; 

    }
    public TreeNode bstFromPreorder(int[] preorder) {
       return buildbst(preorder , 0 , preorder.length-1); 
    }
}