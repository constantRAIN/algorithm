package leetcode;

import tree.TreeNode;

/**
 * @author : zxliuyu
 * @date : 2022-03-01 00:30
 */
public class GoodNodes1448 {

	/**
	 * 1448. 统计二叉树中好节点的数目
	 * 给你一棵根为 root 的二叉树，请你返回二叉树中好节点的数目。
	 *
	 * 「好节点」X 定义为：从根到该节点 X 所经过的节点中，没有任何节点的值大于 X 的值。
	 * @param root
	 * @return
	 */
	public static int goodNodes(TreeNode root) {
		return dfs(root, root.val);
	}

	private static int count = 0;
	public static int dfs(TreeNode node, int currentMaxVal) {
		if (node == null) {
			return count;
		}
		if (node.val >= currentMaxVal) {
			count ++;
		}
		dfs(node.left, Math.max(currentMaxVal, node.val));
		dfs(node.right, Math.max(currentMaxVal, node.val));
		return count;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode root2 = new TreeNode(4);
		root.left = root2;

		int count = goodNodes(root);
		System.out.println(count);
	}
}
