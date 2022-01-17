package leetcode;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length <= 1) {
            return cost[0];
        }
        int[] result = new int[cost.length + 1];
        result[1] = 0;
        result[0] = 0;
        for (int i = 2; i <= cost.length; i++) {
            result[i] = Math.min(result[i - 1] + cost[i - 1], result[i - 2] + cost[i - 2]);
        }
        return result[cost.length];
    }
}
