package leetcode;

public class Fib {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int fib2(int n) {
        // 定义数组
        int[] a = new int[100];
        // 找到初始值
        a[0] = 0;
        a[1] = 1;
        for(int i = 2; i < a.length; i++) {
            // 找到动态规划的公式
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
}
