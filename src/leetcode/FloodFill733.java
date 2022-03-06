package leetcode;

/**
 * @author : zxliuyu
 * @date : 2022-03-06 18:23
 */
public class FloodFill733 {

	/**
	 *
	 * 733. 图像渲染
	 *
	 * 有一幅以 m x n 的二维整数数组表示的图画 image ，其中 image[i][j] 表示该图画的像素值大小。
	 *
	 * 你也被给予三个整数 sr ,  sc 和 newColor 。你应该从像素 image[sr][sc] 开始对图像进行 上色填充 。
	 *
	 * 为了完成 上色工作 ，从初始像素开始，记录初始坐标的 上下左右四个方向上 像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应 四个方向上 像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为 newColor 。
	 *
	 * 最后返回 经过上色渲染后的图像 。
	 *
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/flood-fill
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * @param image
	 * @param sr
	 * @param sc
	 * @param newColor
	 * @return
	 */
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		dfs(image, sr, sc, newColor, image[sr][sc]);
		return image;
	}

	public static void dfs(int[][] image, int left, int right, int target, int source) {
		if (target == source) {
			return;
		}
		if (!isGegal(image, left, right)) {
			return;
		}
		if (image[left][right] != source) {
			return;
		}
		image[left][right] =  target;
		dfs(image, left - 1, right, target, source);
		dfs(image, left + 1, right, target, source);
		dfs(image, left, right - 1, target, source);
		dfs(image, left, right + 1, target, source);
	}

	private static boolean isGegal(int[][] image, int left, int right) {
		return left >= 0 && left < image.length && right >= 0 && right < image[0].length;
	}

	public static void main(String[] args) {
		int[][] image = new int[][]{{0,0,0},{0,1,1}};
		floodFill(image, 1, 1, 1);
	}
}
