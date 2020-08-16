package DailyWork.LinkedListCycleII;

/**
 * 142.环形链表: 查找环入口
 * 固定方法: 在判断环相遇节点, 从头和相遇节点同时步进, 相遇时节点则为环入口
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode b = checkCycle(head);
        if(b == null) return null;
        while (head != b){
            b = b.next;
            head = head.next;
        }
        return head;
    }

    private ListNode checkCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return fast;
        }
        return null;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
