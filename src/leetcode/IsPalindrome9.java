package leetcode;

public class IsPalindrome9 {

    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        int length = number.length();
        int i = 0;
        while (i != length/2) {
            if (number.charAt(i) != number.charAt(length - 1 - i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
