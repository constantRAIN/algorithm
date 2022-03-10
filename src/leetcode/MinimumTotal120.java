package leetcode;

import java.util.List;

/**
 * @author : zxliuyu
 * @date : 2022-03-11 00:21
 */
public class MinimumTotal120 {

	/**
	 * 120. 三角形最小路径和
	 * @param triangle
	 * @return
	 */
	public int minimumTotal(List<List<Integer>> triangle) {
		int[][] dp = new int[triangle.size()][triangle.size()];
		dp[0][0] = triangle.get(0).get(0);
		for (int i = 1; i < triangle.size(); i++) {
			dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
			for (int j = 1; j < i; j++) {
				dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
			}
			dp[i][i] = dp[i-1][i-1] + + triangle.get(i).get(i);
		}

		int min = dp[triangle.size() - 1][0];
		for (int i = 1; i < triangle.size(); i++) {
			min = Math.min(min, dp[triangle.size() - 1][i]);
		}
		return min;
	}

}
