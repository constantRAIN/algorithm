package niuke.search;

import java.util.HashMap;
import java.util.Map;

public class GetNumberOfK {

    private int count = 0;

    public int GetNumberOfK(int[] array, int k) {
//        return withMap(array, k);
//        return withParam(array, k);
        int left = binarySearch(array, k);
        int right = binarySearch(array, k + 1);
        return right - left;
    }

    private int binarySearch(int[] array, int k) {
        int left = 0, right = array.length;
        while (left < right) {
            int middle = (left + right - 1) / 2;
            if (k > array[middle]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    private int withParam(int[] array, int k) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                ret++;
            }
        }
        return ret;
    }

    private int withMap(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        return map.getOrDefault(k, 0);
    }
}
