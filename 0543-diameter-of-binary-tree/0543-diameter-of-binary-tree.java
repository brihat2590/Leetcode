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
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        // Recursively find height of left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Diameter is maximum of (leftHeight + rightHeight)
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height of current subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }
}