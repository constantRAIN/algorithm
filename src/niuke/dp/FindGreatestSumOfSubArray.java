package niuke.dp;

public class FindGreatestSumOfSubArray {
    /**
     * 动态规划
     * 方程
     * dp[i]{
     *     array[i] dp[i-1] <= 0
     *     dp[i-1] + array[i] dp[i-1] > 0
     * }
     * 初始值 dp[0] = 0
     * @param array
     * @return
     */
    public int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > 0) {
                array[i] += array[i - 1];
            }
            res = Math.max(res, array[i]);
        }
        return res;
    }
}
