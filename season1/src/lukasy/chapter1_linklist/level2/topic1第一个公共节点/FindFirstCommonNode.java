package lukasy.chapter1_linklist.level2.topic1第一个公共节点;

import lukasy.chapter1_linklist.level1.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author LukAsy_
 * @date 2023/11/28
 */
public class FindFirstCommonNode {
    /**
     * method1：通过Hash辅助查找
     *
     * @param pHead1
     * @param pHead2
     * @return
     */
    public static ListNode findFirstCommonNodeByMap(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;

        HashMap<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
        while (cur1 != null) {
            hashMap.put(cur1, null);
            cur1 = cur1.next;
        }

        while (cur2 != null) {
            if (hashMap.containsKey(cur2))
                return cur2;
            cur2 = cur2.next;
        }
        return null;
    }


    /**
     * 方法2：通过集合来辅助查找
     *
     * @param headA
     * @param headB
     * @return
     */

    public static ListNode findFirstCommonNodeBySet(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB))
                return headB;
            headB = headB.next;
        }
        return null;
    }
}
