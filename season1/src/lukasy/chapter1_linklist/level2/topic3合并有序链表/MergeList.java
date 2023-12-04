package lukasy.chapter1_linklist.level2.topic3合并有序链表;

import lukasy.chapter1_linklist.level1.ListNode;

import java.util.List;

/**
 * @author LukAsy_
 * @date 2023/12/2
 */
public class MergeList {
    /**
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoListsMoreSimple(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode cur = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return cur.next;
    }

    /**
     * 合并K个链表
     *
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode cur = null;
        for (ListNode list : lists) {
            cur = mergeTwoListsMoreSimple(cur, list);
        }
        return cur;
    }

    /**
     * @param list1
     * @param list2
     * @param a     待删除链表位置的头
     * @param b     待删除链表位置的尾
     * @return
     */
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pre1 = list1, post1 = list1, post2 = list2;
        int i = 0, j = 0;
        //遍历l1并找出需要删除部分的头尾
        while (pre1 != null && post1 != null && j < b) {
            if (i != a - 1) {
                pre1 = pre1.next;
                i++;
            }
            if (j != b) {
                post1 = post1.next;
                j++;
            }
        }
        //遍历l2
        while (list2.next != null) {
            post2 = post2.next;
        }

        //将l2的尾部接到l1需要删除部分头节点的前一个节点，l2头接l1后半部分的头
        pre1.next = list2;
        post2.next = post1.next;
        return list1;
    }
}
