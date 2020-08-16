package DailyWork.LinkedListCycle;

/**
 * 141.环形链表
 * 快慢指针法
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if(head== null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
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
