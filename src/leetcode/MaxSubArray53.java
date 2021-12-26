package leetcode;

public class MaxSubArray53 {
    public static void main(String[] args) {

    }

    /**
     * 53. 最大子序和
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 贪心算法解法
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int currentSubArraysum = 0;
        int maxSubArraySum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (currentSubArraysum > 0) {
                currentSubArraysum += nums[i];
            }else {
                currentSubArraysum = nums[i];
            }
            maxSubArraySum = Math.max(currentSubArraysum, maxSubArraySum);
        }
        return maxSubArraySum;
    }
}
