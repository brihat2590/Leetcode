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

    int preIndex=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
            //map ma halyo taki root ko index
            // tha hos;
        }

        return build(preorder,0,inorder.length-1);
        
    }

    public TreeNode build(int[] preorder,int start,int end){
        if(start>end) return null;

        //root ko vlaue first ma 

        int rootVal=preorder[preIndex];
        preIndex++;


        TreeNode root=new TreeNode(rootVal);
        int inorderIndex=map.get(root.val);
        root.left=build(preorder,start,inorderIndex-1);
        root.right=build(preorder,inorderIndex+1,end);


        return root;
    }
}