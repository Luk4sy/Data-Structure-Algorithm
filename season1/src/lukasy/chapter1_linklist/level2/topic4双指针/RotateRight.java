package lukasy.chapter1_linklist.level2.topic4双指针;

import lukasy.chapter1_linklist.level1.ListNode;

public class RotateRight {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        while (k % len == 0) {
            return head;
        }
        while ((k % len) > 0) {
            k--;
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode res = slow.next;
        slow.next = null;
        fast.next = temp;
        return res;
    }
}
