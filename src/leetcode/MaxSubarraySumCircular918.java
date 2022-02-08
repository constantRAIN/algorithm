package leetcode;

public class MaxSubarraySumCircular918 {

    public int maxSubarraySumCircular(int[] nums) {
        int curMax = 0, maxSubArray = nums[0], curMin = 0, minSubArray = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            curMax = Math.max(nums[i], curMax + nums[i]);
            maxSubArray = Math.max(curMax, maxSubArray);
            curMin = Math.min(nums[i], curMin + nums[i]);
            minSubArray = Math.min(curMin, minSubArray);
            sum += nums[i];
        }
        return maxSubArray > 0 ? Math.max(maxSubArray, sum - minSubArray) : maxSubArray;

    }
}
