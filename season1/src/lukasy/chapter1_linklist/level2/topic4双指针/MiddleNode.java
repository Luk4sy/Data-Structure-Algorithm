package lukasy.chapter1_linklist.level2.topic4双指针;

import lukasy.chapter1_linklist.level1.ListNode;

public class MiddleNode {
    private static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
