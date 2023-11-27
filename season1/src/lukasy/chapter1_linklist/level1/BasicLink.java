package lukasy.chapter1_linklist.level1;

import org.w3c.dom.Node;

public class BasicLink {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        Node head = initLinkedList(a);
        System.out.println(head);
    }

    private static Node initLinkedList(int[] array) {
        Node head = null, cur = null;
        for (int i = 0; i < array.length; i++) {
            Node newNode = new Node(array[i]);
            newNode.next = null;
            if (i == 0) {
                head = newNode;
                cur = newNode;
            } else {
                cur.next = newNode;
                cur = newNode;
            }
        }
        return head;
    }

    static class Node {
        public int val;
        public Node next;

        public Node(int x) {
            val = x;
            next = null;
        }
    }
}
