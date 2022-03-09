package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zxliuyu
 * @date : 2022-03-10 00:44
 */
public class Permute46_2 {

	static List<List<Integer>> result = new ArrayList<>();
	public static List<List<Integer>> permute(int[] nums) {
		dfs(nums, new ArrayList<>(), new boolean[nums.length]);
		return result;
	}

	public static void dfs(int[] nums, List<Integer> list, boolean[] flag) {
		if (list.size() == nums.length) {
			result.add(new ArrayList<>(list));
			return;
		}
		for (int j = 0; j < nums.length; j++) {
			if (!flag[j]) {
				list.add(nums[j]);
				flag[j] = true;
			}else {
				continue;
			}
			dfs(nums, list, flag);
			flag[j] = false;
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> permute = permute(new int[]{1, 2, 3});
		System.out.println(permute);
	}

}
