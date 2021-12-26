package niuke;

import link.model.ListNode;

import java.util.HashSet;
import java.util.Set;

public class EntryNodeOfLoop {

    /**
     * 利用辅助集合解决链表中环的入口节点
     * @param pHead
     * @return
     */
    public ListNode entryNodeOfLoop(ListNode pHead) {
        Set<ListNode> set = new HashSet<>();
        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            }
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }

    /**
     * 利用快慢指针
     * @param pHead
     * @return
     */
    public ListNode entryNodeOfLoop2(ListNode pHead) {
        ListNode fast = pHead, slow = pHead;
        while (fast != null && slow != null) {
            if (fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        while (pHead != null && slow != null) {
            if (pHead == slow) {
                return pHead;
            }
            pHead = pHead.next;
            slow = slow.next;
        }
        return null;
    }
}
