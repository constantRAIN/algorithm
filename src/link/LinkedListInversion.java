package link;

import link.model.ListNode;

public class LinkedListInversion {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
//        ListNode node = iterator(node1);
//        System.out.println(node);

        recursion(node1);
        System.out.println(prev);

    }

    private static ListNode iterator(ListNode head) {
        ListNode prev = null, next;
        ListNode current = head;
        while (current != null) {
            // 将当前节点的下一个节点赋值给next，保证后续节点
            next = current.next;
            // 将当前节点的下一个节点赋值为前置节点
            current.next = prev;
            // 将当前节点赋值为前置节点
            prev = current;
            // 往下走一步，进入下一次遍历
            current = next;
        }
        return prev;
    }

    static ListNode prev = null, next;
    private static void recursion(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode current = head;
        next = current.next;
        current.next = prev;
        prev = current;
        recursion(next);
    }
}
