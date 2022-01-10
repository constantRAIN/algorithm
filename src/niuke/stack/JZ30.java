package niuke.stack;

import java.util.Stack;

public class JZ30 {
    private Stack<Integer> stack = new Stack<>();


    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < stack.size(); i++) {
            min = Math.min(stack.get(i), min);
        }
        return min;
    }

    public static void main(String[] args) {
        JZ30 jz30 = new JZ30();
        jz30.push(9);
        jz30.push(1);
        jz30.push(6);
        System.out.println(jz30.min());
        jz30.pop();
        jz30.pop();
        System.out.println(jz30.min());
    }
}
