package leetcode;

import java.util.Stack;

public class DecodeString {
    int i;

    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                String number = getDigit(s);
                stack.push(number);
            } else if (Character.isLetter(s.charAt(i)) || s.charAt(i) == '[') {
                stack.push(String.valueOf(s.charAt(i)));
                i++;
            } else {
                i++;
                StringBuilder stringBuilder = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    stringBuilder.append(stack.pop());
                }
                String subString = stringBuilder.toString();
                stack.pop();
                String stringNumber = stack.pop();
                Integer number = Integer.valueOf(stringNumber);
                while (number-- > 0) {
                    stack.push(subString);
                }
            }
        }

        return getString(stack);
    }

    public String getDigit(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        while (Character.isDigit(s.charAt(i))) {
            stringBuilder.append(s.charAt(i++));
        }
        return stringBuilder.toString();
    }

    public String getString(Stack<String> stack) {
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        char c = "100leetcode".charAt(0);
        System.out.println(c);
    }
}
