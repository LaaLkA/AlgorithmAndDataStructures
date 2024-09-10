package Sems.Sem3;

public class Main_singleLinkedList {
    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i < 6; i++) {
            list.pushForward(i);
        }
        list.print();
        list.popForward();
        list.print();

        list.pushBack(7);
        list.print();
        System.out.println(list.consist(7));
        System.out.println(list.consist(71));

        list.popBack();
        list.print();

    }

    public static class List {
        Node head;

        public void pushForward(int value) {
            Node node = new Node();
            node.value = value;

            if (head != null) {
                node.next = head;
                head = node;
            } else
                head = node;
        }

        public void popForward() {
            if (head != null) {
                head = head.next;
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

            if (head != null) {
                Node cur = head;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = node;
            } else
                head = node;
        }

        public void popBack() {
            if (head != null) {
                if (head.next == null) {
                    head = null;
                } else {
                    Node cur = head;
                    while (cur.next.next != null) {
                        cur = cur.next;
                    }
                    cur.next = null;
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
        }
    }
}


