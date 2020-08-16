package DailyWork.ReverseLinkedList;

/**
 * 206.翻转单项链表
 * 递归方法
 * 结束条件: curr == null || curr.next == null
 * 返回: 尾结点
 * 处理: 将next的指针指向自己, 将自己的指针置为null
 */
public class Solution2 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }


    class ListNode {
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
