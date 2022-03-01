package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zxliuyu
 * @date : 2022-03-02 00:28
 */
public class Permute46 {

	/**
	 * 46. 全排列
	 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
	 * @param nums
	 * @return
	 */

	public List<List<Integer>> permute(int[] nums) {
		ArrayList<List<Integer>> list = new ArrayList<>();
		boolean[] used = new boolean[nums.length];
		recursion(nums, list, new ArrayList<>(),used);
		return list;
	}

	public void recursion(int[] nums, ArrayList<List<Integer>> list, List<Integer> result, boolean[] used) {
		if (result.size() == nums.length) {
			list.add(new ArrayList<>(result));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i]) {
				continue;
			}
			result.add(nums[i]);
			used[i] = true;
			recursion(nums, list, result,used);
			used[i] = false;
			result.remove(result.size() - 1);
		}
	}

}
