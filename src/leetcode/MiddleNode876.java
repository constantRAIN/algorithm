package leetcode;

import link.model.ListNode;

/**
 * @author : zxliuyu
 * @date : 2022-03-06 11:02
 */
public class MiddleNode876 {
	/**
	 * 876. 链表的中间结点
	 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
	 *
	 * 如果有两个中间结点，则返回第二个中间结点。
	 * @param head
	 * @return
	 */
	public ListNode middleNode(ListNode head) {
		ListNode current = head;
		int nodeLength = 0;
		while (current != null) {
			current = current.next;
			nodeLength++;
		}
//		int middle = nodeLength % 2 == 0 ? (nodeLength / 2 + 1) : (nodeLength / 2);
		for (int j = 0; j < nodeLength / 2; j++) {
			head = head.next;
		}
		return  head;
	}
}
