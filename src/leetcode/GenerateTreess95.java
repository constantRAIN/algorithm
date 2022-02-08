package leetcode;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zxliuyu
 * @date : 2022-02-09 00:26
 */
public class GenerateTreess95 {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        return getAns(1, n);
    }

    public List<TreeNode> getAns(int start, int end) {
        List<TreeNode> ans = new ArrayList<>();
        if (start > end) {
            ans.add(null);
            return ans;
        }
        if (start == end) {
            TreeNode node = new TreeNode(start);
            ans.add(node);
            return ans;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftNodes = getAns(start, i - 1);
            List<TreeNode> rightNodes = getAns(i + 1, end);
            for (TreeNode left : leftNodes) {
                for (TreeNode right : rightNodes) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
