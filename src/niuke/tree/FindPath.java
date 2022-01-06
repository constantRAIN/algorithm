package niuke.tree;

import tree.TreeNode;

import java.util.ArrayList;

public class FindPath {
    private ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int expectNumber) {
        dfs(root, expectNumber, new ArrayList<>());
        return list;
    }

    public void dfs(TreeNode root, int expectNumber, ArrayList<Integer> arrayList) {
        if (root == null) {
            return;
        }
        int val = root.val;
        arrayList.add(val);
        expectNumber -= val;
        if (expectNumber == 0 && root.left == null && root.right == null) {
            list.add(new ArrayList<>(arrayList));
        }
        if (root.left != null) {
            dfs(root.left, expectNumber, arrayList);
        }
        if (root.right != null) {
            dfs(root.right, expectNumber, arrayList);
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
