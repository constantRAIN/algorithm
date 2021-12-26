package niuke.tree;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PrintTree {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        return deque(pRoot);

    }
    private ArrayList deque(TreeNode pRoot) {
        // 双向队列来解决问题
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        ArrayList result = new ArrayList();
        if (pRoot != null) {
            deque.add(pRoot);
        }
        while (!deque.isEmpty()) {
            // 奇数层 从左到右打印
            ArrayList tmp = new ArrayList();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode treeNode = deque.removeFirst();
                tmp.add(treeNode.val);
                if (treeNode.left != null) {
                    deque.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.addLast(treeNode.right);
                }
            }
            result.add(tmp);
            if(deque.isEmpty()) break; // 若为空则提前跳出
            tmp = new ArrayList();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode treeNode = deque.removeLast();
                tmp.add(treeNode.val);
                if (treeNode.right != null) {
                    deque.addFirst(treeNode.right);
                }
                if (treeNode.left != null) {
                    deque.addFirst(treeNode.left);
                }
            }
            result.add(tmp);
        }
        return result;
    }


}
