package niuke.tree;

import tree.TreeNode;

public class IsSymmetrical {

    /**
     * 对称的二叉树
     * 根节点的左右子树的根节点值相同
     * 左子树的左节点的值=右子树右节点的值
     * 左子树的右节点的值=右子树左节点的值
     * @param pRoot
     * @return
     */
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return dfs(pRoot.left, pRoot.right);
    }

    boolean dfs(TreeNode lNode, TreeNode rNode) {
        if (lNode == null && rNode == null) {
            return true;
        }
        if (lNode == null || rNode == null ) {
            return false;
        }
        return lNode.val == rNode.val
                && dfs(lNode.left, rNode.right)
                && dfs(lNode.right, rNode.left);
    }
}
