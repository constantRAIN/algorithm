package niuke.tree;


import tree.TreeNode;

public class TreeDepth {

    public int TreeDepth(TreeNode root) {
        return dfs(root, 0);
    }
    public int dfs(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        int leftDepth = dfs(root.left, depth + 1);
        int rightDepth = dfs(root.right, depth + 1);
        return Math.max(leftDepth, rightDepth);
    }
}
