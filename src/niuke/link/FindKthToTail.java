package niuke.link;

import link.model.ListNode;

public class FindKthToTail {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pHead ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode fast = pHead, slow = pHead;
        while (k > 0 && fast != null) {
            fast = fast.next;
            k--;
        }
        if (k > 0) {
            return null;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
