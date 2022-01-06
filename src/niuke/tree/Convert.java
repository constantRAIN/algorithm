package niuke.tree;

import tree.TreeNode;

import java.util.ArrayList;


public class Convert {
    ArrayList<TreeNode> list = new ArrayList<>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return pRootOfTree;
        }
        dfs(pRootOfTree);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i+1);
            list.get(i + 1).left = list.get(i);
        }
        return list.get(0);
    }
    public void dfs(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return;
        }
        dfs(pRootOfTree.left);
        list.add(pRootOfTree);
        dfs(pRootOfTree.right);
    }

    private TreeNode pre = null;
    private TreeNode cur = null;
    public TreeNode ConvertO1(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return pRootOfTree;
        }
        ConvertO1(pRootOfTree.left);
        if (cur == null) {
            cur = pRootOfTree;
            pre = pRootOfTree;
        }else {
            cur.right = pRootOfTree;
            pRootOfTree.left = cur;
            cur = pRootOfTree;
        }
        ConvertO1(pRootOfTree.right);
        return pre;
    }
}
