package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zxliuyu
 * @date : 2022-02-08 00:31
 */
public class GenerateParenthesis22 {

    /**
     * 22. 括号生成
     * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        dfs("", n, n, result);
        return result;
    }

    public void dfs(String curStr, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(curStr);
            return;
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            dfs(curStr + "(", left -1, right , result);
        }
        if (right > 0) {
            dfs(curStr + ")", left , right-1, result);

        }
    }
}
