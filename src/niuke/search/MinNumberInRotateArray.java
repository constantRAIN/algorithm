package niuke.search;

public class MinNumberInRotateArray {

    public int minNumberInRotateArray(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                return array[i+1];
            }
        }
        return array[0];
    }

    public int binarySearch(int [] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int middle = (right + left) >> 1;
            if (array[middle] > array[right]) {
                left = middle + 1;
            }else if (array[middle] < array[right]){
                right = middle;
            }else {
                right--;
            }
        }
        return array[left];
    }
}
