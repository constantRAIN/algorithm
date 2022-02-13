package leetcode;

public class MyAtoi8 {

    public int myAtoi(String s) {
        String newS = s.trim();
        int flag = 1;
        String numberStr = "";
        if (newS.length() < 1) {
            return 0;
        }
        if (newS.charAt(0) == '-') {
            numberStr += '-';
        }else if (newS.charAt(0) == '+') {
            flag = flag;
        }else if (Character.isDigit(newS.charAt(0))) {
            numberStr += newS.charAt(0);
        }else {
            return 0;
        }
        for (int i = 1; i < newS.length(); i++) {
            if (!Character.isDigit(newS.charAt(i))) {
                break;
            }
            numberStr += newS.charAt(i);
            if (Long.valueOf(numberStr) >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }else if (Long.valueOf(numberStr) <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        if ("".equals(numberStr) || "-".equals(numberStr) || "+".equals(numberStr)) {
            return 0;
        }
        return Integer.valueOf(numberStr);
    }

    public static void main(String[] args) {
        int i = "42".compareTo(String.valueOf(Integer.MAX_VALUE));
        int j = "-1".compareTo("1");
        System.out.println(i);
        System.out.println(j);
    }
}
