package niuke.tree;

import tree.TreeNode;

public class IsBalancedSolution {
    boolean isBalanced = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        dfs(root);
        return isBalanced;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = dfs(root.left);
        int rightDepth = dfs(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1) {
            isBalanced = false;
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
