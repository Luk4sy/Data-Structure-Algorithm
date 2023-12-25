package lukasy.chapter1_linklist.level2.topic5删除元素;

import lukasy.chapter1_linklist.level1.ListNode;

public class DeleteBackwardsPoint {
    /**
     * 方法1：删除倒数第N个结点
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEndByLength(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }

    public static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }


    /**
     * 方法3：通过双指针
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEndByTwoPoints(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
