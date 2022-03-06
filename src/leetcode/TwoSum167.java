package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zxliuyu
 * @date : 2022-03-03 01:30
 */
public class TwoSum167 {

	/**
	 * 167. 两数之和 II - 输入有序数组
	 * <p>
	 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
	 * <p>
	 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
	 * <p>
	 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
	 * <p>
	 * 你所设计的解决方案必须只使用常量级的额外空间。
	 * <p>
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 *
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				return new int[]{map.get(target - numbers[i]) + 1, i + 1};
			}
			map.put(numbers[i], i);
		}
		return null;
	}

	public int[] twoSum2(int[] numbers, int target) {
		int i = 0, j = numbers.length - 1;
		while (i < j) {
			if (numbers[i] + numbers[j] == target) {
				return new int[]{i + 1, j + 1};
			} else if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return null;
	}
}