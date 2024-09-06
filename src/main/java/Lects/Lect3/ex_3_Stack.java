package Lects.Lect3;

public class ex_3_Stack {
    Node head;

        public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public class Node {
        int value;
        Node next;
    }
}
