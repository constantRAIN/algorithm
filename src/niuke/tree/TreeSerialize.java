package niuke.tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSerialize {
    private static final String WELL_NUMBER = "#";
    private static final String COMMA_NUMBER = ",";

    String Serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        dfs(root, stringBuilder);
        return stringBuilder.toString();
    }

    void dfs(TreeNode node, StringBuilder stringBuilder) {
        if (node == null) {
            stringBuilder.append(WELL_NUMBER).append(COMMA_NUMBER);
            return;
        }
        stringBuilder.append(node.val).append(COMMA_NUMBER);
        dfs(node.left, stringBuilder);
        dfs(node.right, stringBuilder);
    }

    TreeNode Deserialize(String str) {
        String[] split = str.split(COMMA_NUMBER);
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            queue.offer(split[i]);
        }
        return de(queue);
    }

    TreeNode de(Queue<String> queue){
        String s = queue.poll();
        if (WELL_NUMBER.equals(s)) {
            return null;
        }
        TreeNode head = new TreeNode(Integer.valueOf(s));
        head.left = de(queue);
        head.right = de(queue);
        return head;
    }
}
