package niuke.tree;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Print {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(pRoot);
        while (!deque.isEmpty()){
            int length = deque.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                TreeNode node = deque.removeFirst();
                list.add(node.val);
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
