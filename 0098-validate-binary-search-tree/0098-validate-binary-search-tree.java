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
    public boolean isValidBST(TreeNode root) {
        boolean isTrue=helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
        return isTrue;
        
        

        
    }
    public boolean helper(TreeNode root,Long min,Long max){
        if(root==null) return true;
        if(root.val<=min ||root.val>=max) return false;


        return helper(root.left,min,(long)root.val) && helper(root.right,(long)root.val,max);
    }
}