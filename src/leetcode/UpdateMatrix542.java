package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zxliuyu
 * @date : 2022-03-08 01:07
 */
public class UpdateMatrix542 {
	static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	/**
	 *
	 * 542. 01 矩阵
	 *
	 * 给定一个由 0 和 1 组成的矩阵 mat ，请输出一个大小相同的矩阵，其中每一个格子是 mat 中对应位置元素到最近的 0 的距离。
	 *
	 * 两个相邻元素间的距离为 1 。
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/01-matrix
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * @param mat
	 * @return
	 */
	public int[][] updateMatrix(int[][] mat) {
		int left = mat.length;
		int right = mat[0].length;
		int[][] dp = new int[left][right];

		for (int i = 0; i < left; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
		}

		for (int i = 0; i < left; i++) {
			for (int j = 0; j < right; j++) {
				if (mat[i][j] == 0) {
					dp[i][j] = 0;
				}
			}
		}
		// 水平向左，垂直向上
		for (int i = 0; i < left; i++) {
			for (int j = 0; j < right; j++) {
				if (i - 1 >= 0) {
					dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + 1);
				}
				if (j - 1 >= 0) {
					dp[i][j] = Math.min(dp[i][j], dp[i][j-1] + 1);
				}
			}
		}

		// 水平向左，垂直向下
		for (int i = left - 1; i >= 0; i--) {
			for (int j = 0; j < right ; j++) {
				if (i + 1 < left) {
					dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
				}
				if ( j - 1 >= 0) {
					dp[i][j] = Math.min(dp[i][j], dp[i][j -1] + 1);
				}
			}
		}
		// 水平向右，垂直向上
		for (int i = 0; i < left; i++) {
			for (int j = right - 1; j >= 0; j--) {
				if (i - 1 >= 0) {
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
				}
				if (j + 1 < right) {
					dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
				}
			}
		}


		// 水平向右，垂直向下
		for (int i = left - 1; i >= 0; i--) {
			for (int j = right - 1; j >= 0 ; j--) {
				if (i + 1 < left) {
					dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
				}
				if (j + 1 < right) {
					dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
				}
			}
		}
		return dp;
	}
}
