package sort;

/**
 * @author : zxliuyu
 * @date : 2023-02-18 14:38
 */
public class InertSort {

	public static void main(String[] args) {
		int[] arr = {1,4,3,0,6,5};

		insertSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	/**
	 * 插入排序（Insertion Sort）是一种简单的基于比较的排序算法，
	 * 它将待排序数组分为已排序和未排序两部分，
	 * 然后从未排序部分中取出一个元素，
	 * 在已排序部分中找到合适的位置插入该元素，
	 * 直到未排序部分为空为止。
	 * @param arr
	 */
	public static void insertSort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int currentValue = arr[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (arr[j] > currentValue) {
					arr[j + 1] = arr[j];
				}else {
					break;
				}
			}
			arr[j + 1] = currentValue;
		}
	}
}
