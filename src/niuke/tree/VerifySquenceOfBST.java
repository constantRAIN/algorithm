package niuke.tree;

import java.util.Stack;

public class VerifySquenceOfBST {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verifyBST(sequence, 0, sequence.length -1);
    }

    public boolean verifyBST(int [] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int root =  sequence[end];
        int i = start;
        while (sequence[i] < root) {
            ++i;
        }
        int leftEnd = i - 1,rightStart = i;
        while (sequence[i] > root) {
            ++i;
        }
        if (i != end) {
           return false;
        }
        return verifyBST(sequence, start, leftEnd) && verifyBST(sequence, rightStart, end-1);
    }

    public boolean stack(int [] sequence) {
        int root = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = sequence.length - 1; i >= 0; i--) {
            if (sequence[i] > root) {
                return false;
            }
            while (!stack.isEmpty() && sequence[i] < stack.peek()){
                root = stack.pop();
            }
            stack.push(sequence[i]);
        }
        return true;
    }
}
