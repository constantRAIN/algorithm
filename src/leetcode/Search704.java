package leetcode;

/**
 * @author : zxliuyu
 * @date : 2022-02-28 23:47
 */
public class Search704 {

	/**
	 * 704. 二分查找
	 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/binary-search
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		return search2(nums, 0, nums.length, target);
	}
	public int search2(int[] nums, int left, int right, int target) {
		if (left > right) {
			return -1;
		}
		int middle = left + (right - left) / 2;
		if (target > nums[middle]) {
			return search2(nums, middle + 1, right, target);
		}else if (target < nums[middle]) {
			return search2(nums, left, middle - 1, target);
		}else {
			return middle;
		}
	}
}
