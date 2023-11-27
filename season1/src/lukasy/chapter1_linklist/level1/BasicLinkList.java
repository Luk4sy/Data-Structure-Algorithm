package lukasy.chapter1_linklist.level1;

public class BasicLinkList {
    public static int getListLength(Node head) {
        int length = 0;
        Node node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    /**
     * 链表插入
     *
     * @param head       链表头节点
     * @param nodeInsert 待插入节点
     * @param position   待插入位置，从1开始
     * @return 插入后得到的链表头节点
     */
    public static Node insertNode(Node head, Node nodeInsert, int position) {
        if (head == null) {
            //待插入节点为表头的节点
            return nodeInsert;
        }
        //检查判断存放元素个数
        int size = getListLength(head);
        if (position > size + 1 || position < 1) {
            System.out.println("位置参数越界");
            return head;
        }

        //表头插入
        if (position == 1) {
            nodeInsert.next = head;
            head = nodeInsert;
            return head;
        }

        //创建一个节点获取头节点来遍历链表
        Node pNode = head;
        //创建一个count来统计pNode移动的位置
        int count = 1;
        while (count < position - 1) {
            pNode = pNode.next;
            count++;
        }
        nodeInsert.next = pNode.next;
        pNode.next = nodeInsert;

        return head;
    }

    /**
     * 删除节点
     *
     * @param head     头节点
     * @param position 删除节点位置，取值从1开始
     * @return 删除后的链表头节点
     */

    public static Node deleteNode(Node head, int position) {
        if (head == null) {
            return head;
        }
        int size = getListLength(head);
        if (position > size || position < 1) {
            System.out.print("输入参数有误");
            return head;
        }
        if (position == 1) {
            head = head.next;
        } else {
            Node cur = head;
            int count = 1;
            while (count < position - 1) {
                cur = cur.next;
                count++;
            }
            cur.next = cur.next.next;
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


