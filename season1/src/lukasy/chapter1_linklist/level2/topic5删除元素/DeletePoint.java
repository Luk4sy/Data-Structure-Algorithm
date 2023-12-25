package lukasy.chapter1_linklist.level2.topic5删除元素;

import lukasy.chapter1_linklist.level1.ListNode;

public class DeletePoint {
    /**
     * 删除特定值的结点
     *
     * @param head
     * @param val
     * @return
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
