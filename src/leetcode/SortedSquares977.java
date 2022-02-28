package leetcode;

import java.util.Arrays;

/**
 * @author : zxliuyu
 * @date : 2022-03-01 01:10
 */
public class SortedSquares977 {

	/**
	 *
	 * 977. 有序数组的平方
	 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
	 *
	 * @param nums
	 * @return
	 */
	public static int[] sortedSquares(int[] nums) {
		int n = nums.length - 1;
		int[] numsNew = new int[nums.length];
		for (int i = 0, j = n, pox = n; pox >= 0;) {
			if ((nums[i] * nums[i]) > (nums[j] * nums[j])) {
				numsNew[pox] = nums[i] * nums[i];
				i++;
			}else {
				numsNew[pox] = nums[j] * nums[j];
				j--;
			}
			pox--;
		}
		return numsNew;
	}

	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		int[] result = sortedSquares(nums);
		System.out.println(result);
	}

	/**
	 * 冒泡排序
	 * @param numsNew
	 */
	private void bubblingSort(int[] numsNew) {
		for (int i = 0; i < numsNew.length; i++) {
			for (int j = 0; j < numsNew.length - i - 1; j++) {
				if (numsNew[j + 1] <= numsNew[j]) {
					int temp = numsNew[j + 1];
					numsNew[j + 1] = numsNew[j];
					numsNew[j] = temp;
				}else{
					break;
				}
			}
		}
	}

}
