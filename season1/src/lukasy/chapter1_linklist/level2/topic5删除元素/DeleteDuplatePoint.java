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

    /**
     * 重复元素都不要
     *
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) { //判断当前节点下一个节点和下下一个节点的值是否相等
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next; //相等则将相同节点删除，当前节点指向下下一个节点
                }
            } else {
                cur = cur.next; //继续向前遍历
            }
        }
        return dummy.next;
    }
}
