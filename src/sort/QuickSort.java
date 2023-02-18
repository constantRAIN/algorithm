package sort;

/**
 * @author : zxliuyu
 * @date : 2023-02-18 14:38
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 0, 8, 6, 5};

		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	/**
	 * 快速排序
	 * 是一种高效的基于比较的排序算法，
	 * 它是分治思想的一种典型应用。
	 * 快速排序的核心思想是选取一个基准元素（pivot），
	 * 将待排序数组分为两个部分，
	 * 使得左侧部分的所有元素都小于等于基准元素，
	 * 右侧部分的所有元素都大于等于基准元素，
	 * 然后递归地对左侧部分和右侧部分进行排序。
	 *
	 * @param arr
	 */
	public static void quickSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivot = arr[left];
		int i = left, j = right;
		while (i < j) {
			// 首先从最右边找到第一个小于基准的值
			while (i < j && arr[j] >= pivot) {
				j--;
			}
			// 其次从最左边找到第一个大于基准的值
			while (i < j && arr[i] <= pivot) {
				i++;
			}
			if (i < j) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		arr[left] = arr[i];
		arr[i] = pivot;
		quickSort(arr, left, i - 1);
		quickSort(arr, i + 1, right);
	}
}
