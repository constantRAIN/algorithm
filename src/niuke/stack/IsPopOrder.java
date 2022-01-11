package niuke.stack;

import java.util.Stack;

public class IsPopOrder {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int i=0,j=0;
        while (i < pushA.length) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
            i++;
        }
        return stack.isEmpty();
    }
}
