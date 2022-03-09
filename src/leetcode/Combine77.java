package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author : zxliuyu
 * @date : 2022-03-09 23:52
 */
public class Combine77 {

	/**
	 * 77. 组合
	 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
	 *
	 * 你可以按 任何顺序 返回答案。
	 * @param n
	 * @param k
	 * @return
	 */
	static List<List<Integer>> result = new ArrayList<>();
	public static List<List<Integer>> combine(int n, int k) {
		dfs(n, 1, k, new ArrayList<>());
		return result;
	}

	public static void dfs(int n, int i, int k, List<Integer> list) {
		if (list.size() == k) {
			result.add(new ArrayList<>(list));
			return;
		}
		for (int j = i; j <= n - (k - list.size()) + 1; j++) {
			list.add(j);
			dfs(n, ++i, k, list);
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> combine = combine(4, 2);
		System.out.println(combine);
	}
}
