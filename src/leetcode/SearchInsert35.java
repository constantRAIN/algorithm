package leetcode;

/**
 * @author : zxliuyu
 * @date : 2022-03-01 00:16
 */
public class SearchInsert35 {

	/**
	 * 35. 搜索插入位置
	 *
	 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
	 *
	 * 请必须使用时间复杂度为 O(log n) 的算法。
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/search-insert-position
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {
		return searchInsert(nums, 0, nums.length - 1, target);
	}

	public int searchInsert(int[] nums, int left, int right, int target) {
		if (left > right) {
			return left;
		}
		int middle = left + (right - left) / 2;
		if (target > nums[middle]) {
			return searchInsert(nums, middle + 1, right, target);
		}else if (target< nums[middle]) {
			return searchInsert(nums, left, middle - 1, target);
		}else {
			return middle;
		}
	}
}
