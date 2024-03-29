package leetcode;

import java.util.*;

public class SingleNumber136 {

    /**
     * 136. 只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * 说明：
     *
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/single-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num :
                nums) {
            result ^= num;
        }
        return result;
//        return method1(nums);
    }

    private int method1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key :
                keySet) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = 1 ^ 3 ^ 1;
        System.out.println(a);
    }
}
