package niuke.tree;

import tree.TreeNode;

public class LowestCommonAncestorJZ68 {

    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        // write code here
//        return dfs(root, p ,q).val;
        TreeNode current = root;
        while (true) {
            if (p < current.val && q < current.val) {
                current = current.left;
            }else if (p > current.val && q > current.val) {
                current = current.right;
            }else {
                break;
            }
        }
        return current.val;
    }

    public TreeNode dfs(TreeNode node, int p, int q) {
        if (node == null || node.val == p || node.val == q) {
            return node;
        }
        TreeNode left = dfs(node.left, p, q);
        TreeNode right = dfs(node.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return node;
    }
}
