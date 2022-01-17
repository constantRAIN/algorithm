package leetcode;

public class Tribonacci {

    public int tribonacci(int n) {
        // 定义数组
        int[] result = new int[100];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i - 3] + result[i - 2] + result[i - 1];
        }
        return result[n];
    }
}
