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

	public ListNode removeNthFromEnd2(ListNode head, int n) {
		ListNode prev = new ListNode(0, head);
		ListNode first = head, second = prev;
		for (int i = 0; i < n; i++) {
			first = first.next;
		}
		while (first != null){
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return prev.next;
	}

}
