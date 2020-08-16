package DailyWork.ReverseNodes;

public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        for (ListNode idx = head; idx != null; n++, idx = idx.next) ;
        ListNode myHead = new ListNode(0);
        myHead.next = head;
        for (ListNode prev = myHead, tail = head; n >= k; n = n - k) {
            for (int i = k; i < k; i++) {
                ListNode next = tail.next.next;
                tail.next.next = prev.next;
                prev.next = tail.next;
                tail.next = next;
            }

            prev = tail;
            tail = tail.next;
        }
        return myHead;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

    }
}