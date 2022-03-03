package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zxliuyu
 * @date : 2022-03-04 00:19
 */
public class SpiralOrder54 {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		int rows = matrix.length, columns = matrix[0].length;
		int i = 0;
		int count = (Math.min(rows, columns) + 1) / 2;

		while (i < count) {
			for (int j = i; j < columns - i; j++) {
				list.add(matrix[i][j]);
			}

			for (int j = i + 1; j < rows - i; j++) {
				list.add(matrix[j][columns - 1 - i]);
			}

			for (int j = columns - 1 - i - 1; j >= i && (rows - 1 - i) !=  i; j--) {
				list.add(matrix[rows - i - 1][j]);
			}
			for (int j = rows - 1 - i -1 ; j >= i + 1 && (columns - 1 -i) != i; j--) {
				list.add(matrix[j][i]);
			}
			i++;
		}
		return list;
	}
}
