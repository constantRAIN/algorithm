package sort;

/**
 * @author : zxliuyu
 * @date : 2023-02-18 14:38
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 0, 8,6, 5};

		selectSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	/**
	 * 选择排序
	 * 是一种简单的基于比较的排序算法，
	 * 它将待排序数组分为已排序和未排序两部分，
	 * 每次从未排序部分中选择最小的元素，
	 * 将它与未排序部分的第一个元素交换，
	 * 然后将交换后的第一个元素归入已排序部分，
	 * 直到未排序部分为空为止。
	 *
	 * @param arr
	 */
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int position = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[position]) {
					position = j;
				}
			}
			swap(arr, i, position);
		}
	}

	private static void swap(int[] arr, int i, int position) {
		if (i == position) {
			return;
		}
		int tmp = arr[i];
		arr[i] = arr[position];
		arr[position] = tmp;
	}
}
