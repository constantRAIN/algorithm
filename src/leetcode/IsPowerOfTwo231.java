package leetcode;

public class IsPowerOfTwo231 {
    /**
     * 231.  2 的幂
     * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
     * <p>
     * 如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。
     * <p>
     * <p>
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/power-of-two
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    private boolean method1(int n) {
        long tmp = 1;
        while (tmp <= n) {
            if (tmp == n) {
                return true;
            }
            tmp = tmp << 1;
        }
        return false;
    }

}
