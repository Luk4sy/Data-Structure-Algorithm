package lukasy.chapter1_linklist.level2.topic2回文序列;

import lukasy.chapter1_linklist.level1.ListNode;

import java.util.Stack;

public class IsPalindromic {
    public static boolean isPalindromeByAllStack(ListNode head) {
        ListNode cur = head;
        Stack<Integer> stack = new Stack<>();
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
