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
    
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result=new ArrayList<>();

        helperfxn(root,"",result);

        return result;

        


        
        
    }
    public void helperfxn(TreeNode root,String path,List<String> result){
        if(root==null) return;
        //first ma path empty huna paryo tespaxi balla -> haldai jane
        if(path.isEmpty()){
            path=Integer.toString(root.val);
        }
        else{
             path=path+"->"+root.val;
        }
        //condition leaf huna lali
        if(root.left==null && root.right==null){
            result.add(path);
            
        }

        helperfxn(root.left,path,result);

        helperfxn(root.right,path,result);
    }
}