package niuke.tree;

import tree.TreeNode;

import java.util.HashMap;

public class ReConstructBinaryTree {


    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        if (pre == null || pre.length == 0 || vin == null || vin.length == 0) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < vin.length; i++) {
            map.put(vin[i], i);
        }
        return process(pre, 0, pre.length - 1, 0, vin.length - 1, map);
    }

    /**
     *
     * @param pre 先序遍历的数组
     * @param pLeft 先序遍历的左子树
     * @param pRight 先序遍历的右子树
     * @param iLeft  中序遍历的左子树
     * @param iRight 中序遍历的右子树
     * @param map 存放二叉树的节点的map
     * @return
     */
    private TreeNode process(int[] pre,
                             int pLeft,
                             int pRight,
                             int iLeft,
                             int iRight,
                             HashMap<Integer, Integer> map) {
        if (pLeft > pRight || iLeft > iRight) {
            return null;
        }
        if (pLeft == pRight || iLeft == iRight) {
            return new TreeNode(pre[pLeft]);
        }
        TreeNode root = new TreeNode(pre[pLeft]);
        int rootIndex = map.get(pre[pLeft]);
        int leftSize = rootIndex - iLeft;
        root.left = process(pre, pLeft + 1, pLeft + leftSize, iLeft, rootIndex - 1, map);
        root.right = process(pre, pLeft + leftSize + 1, pRight, rootIndex + 1, iRight, map);
        return root;
    }
}
