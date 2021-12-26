package niuke.link;

import link.model.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class LinkedInversion {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while(listNode != null){
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }

    public ListNode reverse(ListNode node) {
        ListNode prev = null, next;
        ListNode current = node;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
