package DailyWork.ReverseLinkedList;

/**
 * 206.翻转单项链表
 *
 * 此处需要两个成员变量,一个临时变量,需要明确java语音中赋值和引用的逻辑
 * *curr.next = prev 将prev设置为curr.next
 */
public class Solution1 {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
           ListNode temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
        }
        return prev;
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
