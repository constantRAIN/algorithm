package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements217 {
    public static void main(String[] args) {

    }

    /**
     * 217. 存在重复元素
     * 给定一个整数数组，判断是否存在重复元素。
     *
     * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
     *
     * @param arr
     * @return
     */
    private static boolean checkDuplicateElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
