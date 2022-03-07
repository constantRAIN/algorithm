package leetcode;

import link.model.Node;

import java.util.*;

/**
 * @author : zxliuyu
 * @date : 2022-03-08 00:13
 */
public class Connect116 {

	public Node connect(Node root) {
		if (root == null) {
			return null;
		}
		Node leftmost = root;
		while (leftmost.left != null) {
			Node head = leftmost;
			while (head != null) {
				head.left.next = head.right;

				if (head.next != null) {
					head.right.next = head.next.left;
				}

				head = head.next;
			}
			leftmost = leftmost.left;
		}
		return root;
//		return bfs(root);
	}

	private Node bfs(Node root) {
		Queue<Node> deque = new LinkedList<>();
		deque.add(root);
		while (!deque.isEmpty()) {
			int length = deque.size();
			for (int i = 0; i < length; i++) {
				Node last = deque.poll();
				if (i < length - 1) {
					last.next = deque.peek();
				}
				if (last.left != null) {
					deque.add(last.left);
					deque.add(last.right);
				}
			}
		}
		return root;
	}
}
