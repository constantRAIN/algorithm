package niuke.tree;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthNode {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param proot TreeNode类
     * @param k int整型
     * @return int整型
     */
    public int KthNode (TreeNode proot, int k) {
        // write code here
        if (proot == null || k <= 0) {
            return -1;
        }
        List<Integer> result = new ArrayList<>();
        preorderTraversal(proot, result);
        if (result.size() < k) {
            return -1;
        }
        return result.get(k - 1);
    }

    public void preorderTraversal(TreeNode proot, List<Integer> result) {
        if (proot == null) {
            return;
        }
        preorderTraversal(proot.left, result);
        result.add(proot.val);
        preorderTraversal(proot.right, result);
    }
}
