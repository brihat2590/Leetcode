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

    int postIndex;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return build(postorder,0,inorder.length-1);
        
    }

    public TreeNode build(int[] postorder, int start, int end){
        if(start>end) return null;

        int rootVal=postorder[postIndex];
        postIndex--;

        TreeNode root=new TreeNode(rootVal);
        int inorderIndex=map.get(rootVal);

        root.right = build(postorder, inorderIndex + 1, end);
        root.left = build(postorder, start, inorderIndex - 1);


        return root;

    }
}