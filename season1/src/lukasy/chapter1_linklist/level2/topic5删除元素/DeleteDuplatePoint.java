package lukasy.chapter1_linklist.level2.topic5删除元素;

import lukasy.chapter1_linklist.level1.ListNode;

public class DeleteDuplatePoint {
    /**
     * 重复元素保留一个
     *
     * @param head
     * @return
     */
    public static ListNode deleteDuplicate(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
