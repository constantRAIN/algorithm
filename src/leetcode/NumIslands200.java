package leetcode;

/**
 * @author : zxliuyu
 * @date : 2022-03-04 01:34
 */
public class NumIslands200 {

	/**
	 * 200. 岛屿数量
	 *
	 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
	 *
	 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
	 *
	 * 此外，你可以假设该网格的四条边均被水包围。
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/number-of-islands
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * @param grid
	 * @return
	 */
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		int c = grid[0].length, r = grid.length;
		int count = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == '1') {
					count++;
					dfs(grid, j, i);
				}
			}
		}
		return count;

	}

	public void dfs(char[][] grid, int c, int r) {
		if (!isLegal(grid, c, r)) {
			return;
		}
		if (grid[r][c] != '1') {
			return;
		}
		grid[r][c] = '2';
		dfs(grid, c - 1, r);
		dfs(grid, c + 1, r);
		dfs(grid, c, r - 1);
		dfs(grid, c, r + 1);
	}

	private boolean isLegal(char[][] grid, int c, int r) {
		return c >= 0 && c < grid[0].length && r >= 0 && r < grid.length;
	}
}
