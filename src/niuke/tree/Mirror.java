package niuke.tree;

import tree.TreeNode;

public class Mirror {
    public TreeNode Mirror (TreeNode pRoot) {
        TreeNode tmp;
        if (pRoot == null) {
            return pRoot;
        }
        tmp = pRoot.right;
        pRoot.right = pRoot.left;
        pRoot.left = tmp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }

}
