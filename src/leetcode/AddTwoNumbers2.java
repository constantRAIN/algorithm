package leetcode;

import link.model.ListNode;

public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n = 0;
        ListNode result = new ListNode(0);
        ListNode current = result;
        while (l1 != null || l2 != null) {
            int l1Val = 0, l2Val = 0;
            if (l1 != null) {
                l1Val = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2Val = l2.val;
                l2 = l2.next;
            }

            int sum = l1Val + l2Val + n;
            current.next = new ListNode(sum % 10 );
            current = current.next;
            if (sum / 10 > 0) {
                n = 1;
            }else {
                n = 0;
            }

        }
        if (n == 1) {
            current.next = new ListNode(n);
        }
        return result.next;
    }
}
