package leetcode;

import tree.TreeNode;

/**
 * @author : zxliuyu
 * @date : 2022-03-07 23:10
 */
public class MergeTrees617 {

	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if(root1 == null) {
			return root2;
		}
		if(root2 == null) {
			return root1;
		}
		TreeNode merged = new TreeNode(root1.val + root2.val);
		merged.left = mergeTrees(root1.left, root2.left);
		merged.right = mergeTrees(root1.right, root2.right);
		return merged;
	}

	public TreeNode dfs(TreeNode node1, TreeNode node2) {
		TreeNode node = new TreeNode(0);
		if (node1 == null && node2 == null) {
			return null;
		}
		node.val = (node1 == null ? 0 : node1.val) + (node2 == null ? 0: node2.val);
		node.left = dfs(node1 == null ? null : node1.left, node2 == null ? null : node2.left);
		node.right = dfs(node1 == null ? null : node1.right, node2 == null ? null : node2.right);
		return node;
	}
}
