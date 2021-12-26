package niuke;


import link.model.ListNode;

public class DeleteDuplication {

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return pHead;
        }

        ListNode dummy = new ListNode(0, pHead);
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            if (current.next.val == current.next.next.val) {
                int x = current.next.val;
                while (current.next != null && current.next.val == x) {
                    current.next = current.next.next;
                }
            }
            current = current.next;
        }
        return dummy.next;
    }
}
