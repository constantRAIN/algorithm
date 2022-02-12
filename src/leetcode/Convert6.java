package leetcode;

public class Convert6 {
    public String convert(String s, int numRows) {
        if (s.length() <= 2 || numRows < 2) {
            return s;
        }
        String[] result = new String[numRows];
        for (int i = 0;i<result.length;i++) {
            result[i] = "";
        }
        int j = 0, flag = 1;
        for (int i = 0; i < s.length(); i++) {
            result[j] += String.valueOf(s.charAt(i));
            j += flag;
            if ( j == 0 || j == numRows - 1 ) {
                flag = -flag;
            }
        }
        String convertResult = "";
        for (int i = 0;i<result.length;i++) {
            convertResult += result[i];
        }
        return convertResult;
    }
}
