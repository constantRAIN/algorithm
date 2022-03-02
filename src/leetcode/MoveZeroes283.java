package leetcode;

/**
 * @author : zxliuyu
 * @date : 2022-03-03 01:17
 */
public class MoveZeroes283 {

	/**
	 * 283. 移动零
	 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
	 *
	 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
	 * @param nums
	 */
	public void moveZeroes(int[] nums) {
		if (nums.length < 2) {
			return;
		}
		int[] newNums = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				continue;
			}
			newNums[j++] = nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = newNums[i];
		}
	}
}
