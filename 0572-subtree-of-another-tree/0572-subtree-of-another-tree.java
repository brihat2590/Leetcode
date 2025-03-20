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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null) return true;
        if(root==null) return false;

        //helper function le true or false
        if(isIdentical(root,subRoot)){
            return true;
        }
        //aru tala ko tree ko values lai repeat be it left or right
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    //check garne is identical cha chaina
    private boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;
        if(root.val!=subRoot.val) return false;
        return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);

    }
}