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
    public int maxDepth(TreeNode root) {
        // Root being null means tree doesn't exist.
    if (root == null) 
      return 0; 

    // Get the depth of the left and right subtree 
    // using recursion.
    int leftDepth = maxDepth(root.left); 
    int rightDepth = maxDepth(root.right); 

    // Choose the larger one and add the root to it.
    if (leftDepth > rightDepth) 
      return (leftDepth + 1); 
    else 
      return (rightDepth + 1);
}
}
