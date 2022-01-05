package niuke.tree;

import tree.TreeNode;

public class HasPathSum {
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if (root == null) {
            return false;
        }
        return sumTreePath(root, sum);
    }

    public boolean sumTreePath(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            return true;
        }

        return sumTreePath(root.left, sum) ||
                sumTreePath(root.right, sum);
    }
}
