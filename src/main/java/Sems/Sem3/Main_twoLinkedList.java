package Sems.Sem3;

public class Main_twoLinkedList {
    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i < 6; i++) {
            list.pushForward(i);
        }
        list.print();


    }

    public static class List {
        Node head;
        Node tail;

        public void pushForward(int value) {
            Node node = new Node();
            node.value = value;

            if (head != null) {
                node.next = head;
                head.prev = node;
            } else {
                tail = node;
            }
            head = node;
        }

        public void popForward() {
            if (head != null) {
                if (head.next == null) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                }
            }
        }

        public boolean consist(int value) {
            Node cur = head;
            while (cur != null) {
                if (cur.value == value)
                    return true;
                cur = cur.next;
            }
            return false;
        }

        public void pushBack(int value) {
            Node node = new Node();
            node.value = value;
            if (tail == null) {
                head = node;
            } else {
                tail.next = node;
                node.prev = tail;
            }
            tail = node;

        }

        public void popBack() {
            if (tail != null) {
                if (tail.prev == null) {
                    head = null;
                    tail = null;
                } else {
                    tail = tail.prev;
                }
            }
        }

        public void print() {
            Node cur = head;
            if (head != null) {
                while (cur != null) {
                    System.out.printf("%d ", cur.value);
                    cur = cur.next;
                }
            }
            System.out.println();
        }

        public class Node {
            int value;
            Node next;
            Node prev;
        }
    }
}


