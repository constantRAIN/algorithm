package sort;

/**
 * @author : zxliuyu
 * @date : 2023-02-18 14:38
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 0, 8,6, 5};

		mergeSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	/**
	 * 归并排序
	 * 是一种经典的基于比较的排序算法，
	 * 它使用分治思想将待排序数组分成两个子数组，
	 * 然后递归地对两个子数组进行排序，
	 * 最后将两个有序的子数组归并成一个有序的数组。
	 * 归并排序的时间复杂度是 O(nlogn)，
	 * 其中 n 是待排序数组的大小，
	 * 它的稳定性较好。
	 * @param arr
	 */
	public static void mergeSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		merge(arr, left, mid, right);
	}
	public static void merge(int[] arr, int left, int mid, int right){
		int[] temp = new int[right - left + 1];
		int i = left, j = mid + 1, k = 0;
		while (i <= mid && j <= right){
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			}else{
				temp[k++] = arr[j++];
			}
		}
		while (i <= mid){
			temp[k++] = arr[i++];
		}
		while (j <= right){
			temp[k++] = arr[j++];
		}
		for (i = left, k = 0; i <= right; i++, k++) {
			arr[i] = temp[k];
		}
	}
}
