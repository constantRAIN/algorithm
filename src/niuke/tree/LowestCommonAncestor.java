package niuke.tree;

import tree.TreeNode;

public class LowestCommonAncestor {

    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        return dfs(root, o1, o2).val;
    }

    public TreeNode dfs(TreeNode node, int o1, int o2) {
        if (node == null || node.val == o1 || node.val == o2) {
            return node;
        }
        TreeNode left = dfs(node.left, o1, o2);
        TreeNode right = dfs(node.right, o1, o2);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return node;
    }

}
