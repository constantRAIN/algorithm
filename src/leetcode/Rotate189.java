package leetcode;

import java.util.*;

/**
 * @author : zxliuyu
 * @date : 2022-03-02 00:07
 */
public class Rotate189 {

	/**
	 * 189. 轮转数组
	 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
	 * @param nums
	 * @param k
	 */
	public void rotate(int[] nums, int k) {
//		queue(nums, k);
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	private void queue(int[] nums, int k) {
		Deque<Integer> result = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			result.add(nums[i]);
		}
		for (int i = 0; i < k; i++) {
			Integer last = result.removeLast();
			result.addFirst(last);
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = result.removeFirst();
		}
	}

}
