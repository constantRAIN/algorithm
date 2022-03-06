package leetcode;

import link.model.ListNode;

/**
 * @author : zxliuyu
 * @date : 2022-03-06 16:37
 */
public class RemoveNthFromEnd19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		int nodeLength = 0;
		ListNode current = head;
		while (current != null) {
			current = current.next;
			nodeLength ++;
		}
		int i = nodeLength - n;
		if (i == 0) {
			head = head.next;
		}
		current = head;

		for (int j = 1; j < nodeLength; j++) {
			if (j == i) {
				current.next = current.next == null ? null :  current.next.next;
				break;
			}
			current  = current.next;
		}
		return head;
	}
}
