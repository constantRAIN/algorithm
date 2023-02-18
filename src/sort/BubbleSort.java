package sort;

/**
 * @author : zxliuyu
 * @date : 2023-02-18 14:19
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,4,3,0,6,5};

		bubbleSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	/**
	 * 冒泡排序
	 * 时间复杂度O(n^2)，空间复杂度O()
	 * 算法思想：相邻元素两两比较，大数下沉，小数上浮，每执行一次循环，完成一个数的排序
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
