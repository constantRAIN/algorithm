package leetcode;

public class ClimbStairs70 {
    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * 你可以在n-1楼梯的时候爬一个
     * 也可以在n-2漏记的时候爬两个
     * dp(n) = dp(n-1) + dp(n-2)
     * dp(1) = 1; dp(2)=2
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        // 定义数组元素的含义
        int[] dp = new int[n + 1];
        // 找到了初始值
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            // 找出关系数组元素之间的方程式
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int climbStairs2(int n) {
        int[] result = new int[n];
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i < result.length; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n - 1];
    }
}
