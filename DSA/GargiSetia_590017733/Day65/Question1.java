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
    HashMap <Integer , Integer > map = new HashMap<>();

    public void inorder(TreeNode root ){
        if ( root == null){
            return ;
        }
        inorder(root.left);
        if(map.containsKey(root.val)){
            map.put(root.val , map.get(root.val)+1);
        }
        else{
            map.put( root.val , 1 );
        }
        inorder(root.right);

    }

    public int[] findMode(TreeNode root) {
        inorder(root);


        // find what is the max frequency 
        int maxfreq = 0 ; 
        for (int freq : map.values()){
            maxfreq = Math.max(freq , maxfreq);
        } 
         
         int count =0 ; 
        for (int freq : map.values()){
            if ( freq == maxfreq){
                count++;
            }
        }
   int arr[] = new int[count];
   int i =0 ; 
        for ( int key :map.keySet()){
            if(map.get(key) == maxfreq){
                arr[i++] = key ; 

            }
            }

return arr; 
        }
        
    
}