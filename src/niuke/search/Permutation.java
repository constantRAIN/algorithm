package niuke.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Permutation {
    ArrayList<String> list = new ArrayList<>();
    char[] chars;
    public ArrayList<String> Permutation(String str) {
        chars = str.toCharArray();
        dfs(0);
        return list;
    }

    public void dfs(int index) {
        if (index == chars.length - 1) {
            list.add(String.valueOf(chars));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            // 剪枝
            if (set.contains(chars[i])) {
                continue;
            }
            set.add(chars[i]);
            swap(i, index);
            dfs(index + 1);
            swap(i, index);
        }
    }

    public void swap(int target, int source) {
        char temp = chars[source];
        chars[source] = chars[target];
        chars[target] = temp;
    }
}
