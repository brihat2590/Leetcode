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
    private int minDiff=Integer.MAX_VALUE;
    private Integer prev=null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
        
    }
    //nothing return just mindiff nikalyo
    //inorder in bst always sorted so duita element ko min diff;
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null){
            minDiff=Math.min(minDiff,root.val-prev);
        }
        prev=root.val;
        inorder(root.right);
    }
}