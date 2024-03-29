package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zxliuyu
 * @date : 2022-03-06 20:45
 */
public class MasAreaOfIsLand695 {

	/**
	 *
	 * 695. 岛屿的最大面积
	 *
	 * 给你一个大小为 m x n 的二进制矩阵 grid 。
	 *
	 * 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在 水平或者竖直的四个方向上 相邻。你可以假设 grid 的四个边缘都被 0（代表水）包围着。
	 *
	 * 岛屿的面积是岛上值为 1 的单元格的数目。
	 *
	 * 计算并返回 grid 中最大的岛屿面积。如果没有岛屿，则返回面积为 0 。
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/max-area-of-island
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * @param grid
	 * @return
	 */
	public static int maxAreaOfIsland(int[][] grid) {
		int left = grid.length;
		int right = grid[0].length;
		int max = 0;
		for (int i = 0; i < left; i++) {
			for (int j = 0; j < right; j++) {
				List<Integer> areas = new ArrayList<>();
				dfs(grid, i, j, areas);
				max = Math.max(max, areas.size());
			}
		}
		return max;
	}

	public static void dfs(int[][] grid, int left, int right, List<Integer> areas) {
		if (!isLegal(grid, left, right)) {
			return ;
		}
		if (grid[left][right] != 1) {
			return;
		}
		areas.add(grid[left][right]);
		grid[left][right] = 0;
		dfs(grid, left - 1, right, areas);
		dfs(grid, left + 1, right, areas);
		dfs(grid, left, right - 1, areas);
		dfs(grid, left, right + 1, areas);
	}

	private static boolean isLegal(int[][] grid, int left, int right) {
		return left >= 0 && left < grid.length && right >= 0 && right < grid[0].length;
	}

	public static void main(String[] args) {
		int[][] result = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		int i = maxAreaOfIsland(result);
		System.out.println(i);
	}


}
