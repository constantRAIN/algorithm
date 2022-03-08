package leetcode;

import link.model.ListNode;

/**
 * @author : zxliuyu
 * @date : 2022-03-09 00:34
 */
public class ReverseList206 {

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode tmp = current.next;
			current.next = prev;
			prev = current;
			current = tmp;
		}
		return prev;
	}
}
