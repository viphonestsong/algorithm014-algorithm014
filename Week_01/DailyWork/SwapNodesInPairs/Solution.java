package DailyWork.SwapNodesInPairs;

/**
 * 24.两两交换链表中的节点(迭代)
 * 注意点: 1.需要创建一个新节点来作为链表头
 *        2.遍历过程中始终以相对于curr进行改变,需要注意顺序
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode myHead = new ListNode(0);
        myHead.next = head;
        ListNode curr = myHead;
        while(curr.next != null || curr.next.next != null){
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            first.next = second.next;
            second.next = curr.next;
            curr = curr.next.next;

        }
        return  myHead.next;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
