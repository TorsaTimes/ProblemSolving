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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return check(root.left,root.right);
    }   
    public boolean check(TreeNode leftN, TreeNode rightN){
        if(leftN == null && rightN == null){
            return true;
        }
        if(leftN == null ^ rightN == null){
            return false;
        }
        if(leftN.val != rightN.val){
            return false;
        }
       
        return check(leftN.left,rightN.right) && check(leftN.right,rightN.left);
    }

}
