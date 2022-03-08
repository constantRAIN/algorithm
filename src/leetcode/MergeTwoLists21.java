package leetcode;

import link.model.ListNode;

/**
 * @author : zxliuyu
 * @date : 2022-03-09 00:19
 */
public class MergeTwoLists21 {

	/**
	 * 21. 合并两个有序链表
	 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode prev = new ListNode(0);
		ListNode current = prev, current1 = list1, current2 = list2;
		while (current1 != null && current2 != null ) {
			if (current1.val > current2.val) {
				current.next = current2;
				current2 = current2.next;
			}else {
				current.next = current1;
				current1 = current1.next;
			}
			current = current.next;
		}

		if (current1 == null) {
			current.next = current2;
		}
		if (current2 == null) {
			current.next = current1;
		}
		return prev.next;
	}
}
