package niuke.tree;

import tree.TreeNode;

public class FindPath3 {
    private int key = 0;
    public int FindPath(TreeNode root, int sum) {
        // write code here
        if (root == null) {
            return key;
        }
        dfs(root, sum);
        FindPath(root.left, sum);
        FindPath(root.right, sum);
        return key;
    }

    public void dfs(TreeNode node, int sum) {
        if (node == null) {
            return;
        }
        sum -= node.val;
        if (sum == 0) {
            key++;
        }
        dfs(node.left, sum);
        dfs(node.right, sum);
    }
}
