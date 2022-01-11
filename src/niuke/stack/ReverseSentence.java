package niuke.stack;

import java.util.Stack;

public class ReverseSentence {

    public String ReverseSentence(String str) {
        String[] split = str.split(" ");
        if (split == null || split.length == 0) {
            return "";
        }
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < split.length; i++) {
            stack.push(split[i]);
        }
        String result = "";
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            result += stack.pop() + " ";
        }
        return result.trim();
    }
}
