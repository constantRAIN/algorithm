package leetcode;

import link.model.ListNode;

import java.util.Stack;

public class CheckValidString678 {

    public static boolean checkValidString(String s) {
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack1.push(i);
            }
            if (s.charAt(i) == '*') {
                stack2.push(i);
            }
            if (s.charAt(i) == ')') {
                int size1 = stack1.size();
                int size2 = stack2.size();
                if (size1 == 0 && size2 == 0) {
                    return false;
                }
                if (size1 != 0) {
                    stack1.pop();
                    continue;
                }
                if (size2 != 0) {
                    stack2.pop();
                    continue;
                }
            }
        }
        while (stack1.size() != 0 && stack2.size() != 0) {
            Integer s1 = stack1.pop();
            Integer s2 = stack2.pop();
            if (s1 > s2) {
                return false;
            }
        }
        return stack1.size() == 0;
    }

    public static void main(String[] args) {
        String a = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        boolean b = checkValidString(a);
        System.out.println(b);
    }
}
