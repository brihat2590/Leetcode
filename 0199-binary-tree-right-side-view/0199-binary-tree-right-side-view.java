class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return result;
    }

    public void dfs(TreeNode node, int level) {
        if (node == null) return;

        //  If this is the first time we are at this level, add the node value
        if (level == result.size()) {
            result.add(node.val);
        }

        
        dfs(node.right, level + 1);
        
        dfs(node.left, level + 1);
    }
}
