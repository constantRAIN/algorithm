package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zxliuyu
 * @date : 2022-03-08 22:49
 */
public class OrangesRotting994 {

	/**
	 * 994. 腐烂的橘子
	 *
	 * 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
	 *
	 * 值 0 代表空单元格；
	 * 值 1 代表新鲜橘子；
	 * 值 2 代表腐烂的橘子。
	 * 每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。
	 *
	 * 返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
	 *
	 *
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/rotting-oranges
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * @param grid
	 * @return
	 */
	public int orangesRotting(int[][] grid) {
		int left = grid.length, right = grid[0].length;
		Queue<int[]> queue = new LinkedList<>();
		int count = 0;
		for (int i = 0; i < left; i++) {
			for (int j = 0; j < right; j++) {
				if (grid[i][j] == 1) {
					count++;
				}else if (grid[i][j] == 2) {
					queue.add(new int[]{i, j});
				}
			}
		}
		int round = 0;
		while (count > 0 && !queue.isEmpty()) {
			round++;
			int length = queue.size();
			for (int i = 0; i < length; i++) {
				int[] orange = queue.poll();
				int r = orange[0];
				int c = orange[1];

				if (r - 1 >= 0 && grid[r-1][c] == 1) {
					grid[r-1][c] = 2;
					count--;
					queue.add(new int[]{r-1, c});
				}

				if (r + 1 < left && grid[r+1][c] == 1) {
					grid[r+1][c] = 2;
					count--;
					queue.add(new int[]{r+1, c});
				}

				if (c - 1 >= 0 && grid[r][c - 1] == 1) {
					grid[r][c - 1] = 2;
					count--;
					queue.add(new int[]{r, c - 1});
				}
				if (c + 1 < right && grid[r][c + 1] == 1) {
					grid[r][c + 1] = 2;
					count--;
					queue.add(new int[]{r, c + 1});
				}
			}
		}
		if (count > 0) {
			return -1;
		}
		return round;
	}
}
