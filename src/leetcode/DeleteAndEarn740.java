package leetcode;

public class DeleteAndEarn740 {
    public int deleteAndEarn(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        int[] sum = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[nums[i]] = nums[i];
        }
        return rob(sum);
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
