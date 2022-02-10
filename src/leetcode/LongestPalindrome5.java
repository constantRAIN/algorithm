package leetcode;

public class LongestPalindrome5 {

    public String longestPalindrome(String s) {
        int length = s.length();
        // 如果字符串长度是1，直接返回就行
        if (length < 2) {
            return s;
        }
        boolean[][] dp = new boolean[length][length];
        // 如果字符串长度是1，则必然是回文串
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        int begin = 0;
        int subLen = 1;
        for (int i = 2; i <= length; i++) {
            for (int j = 0; j < length; j++) {
                int r = i + j - 1;
                if (r >= length) {
                    break;
                }
                if (s.charAt(j) != s.charAt(r)) {
                    dp[j][r] = false;
                }else {
                    if (r - j < 3) {
                        dp[j][r] = true;
                    }else {
                        dp[j][r] = dp[j+1][r-1];
                    }
                }

                if (dp[j][r] && r - j + 1 > subLen) {
                    subLen = r - j + 1;
                    begin = j;
                }
            }
        }
        return s.substring(begin, begin + subLen);
    }
}
