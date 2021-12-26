package niuke;

import link.model.ListNode;

public class DeleteNode {

    public ListNode deleteNode (ListNode head, int val) {
        // write code here
        if (head.val == val) {
            return head.next;
        }
        ListNode current = head;
        while (current != null) {
             if (current.next.val == val) {
                 current.next = current.next.next;
                return head;
            }
            current = current.next;
        }
        return null;
    }
}

