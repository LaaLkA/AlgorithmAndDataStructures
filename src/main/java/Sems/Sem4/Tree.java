package Sems.Sem4;

public class Tree {
    Node root;

    public static void main(String[] args) {
        Tree tree = new Tree();
        for (int i = 1; i <= 5; i++) {
            tree.add(i);
        }
        System.out.println(tree.find(5));
        System.out.println(tree.find(6));
    }

    public void add(int value) {
        if (root != null) {
            add(root, value);
            root = balance(root);
        } else {
            root = new Node();
            root.value = value;
        }
        root.color = Color.BLACK;
    }

    private void add(Node node, int value) {
        if (node.value != value) {
            if (node.value < value) {
                if (node.right == null) {
                    node.right = new Node();
                    node.right.value = value;
                    node.right.color = Color.RED;
                } else {
                    add(node.right, value);
                    node.right = balance(node.right);
                }
            } else {
                if (node.left == null) {
                    node.left = new Node();
                    node.left.value = value;
                    node.left.color = Color.RED;
                } else {
                    add(node.left, value);
                    node.left = balance(node.left);
                }
            }
        }
    }

    public Node find(int value) {
        return find(root, value);
    }

    private Node find(Node node, int value) {
        if (node == null)
            return null;
        if (node.value == value)
            return node;
        if (node.value < value)
            return find(node.right, value);
        else
            return find(node.left, value);
    }

    private Node leftRotate(Node node) {
        Node cur = node.right;
        node.right = cur.left;
        cur.left = node;
        cur.color = node.color;
        node.color = Color.RED;
        return cur;
    }

    private Node rightRotate(Node node) {
        Node cur = node.left;
        node.left = cur.right;
        cur.right = node;
        cur.color = node.color;
        node.color = Color.RED;
        return cur;
    }

    private void colorsSwap(Node node) {
        node.color = (node.color == Color.RED ? Color.BLACK : Color.RED);
        node.left.color = Color.BLACK;
        node.right.color = Color.BLACK;

    }

    private Node balance(Node node) {
        boolean flag = true;
        Node cur = node;
        do {
            flag = false;

            if (cur.right != null && cur.right.color == Color.RED && (cur.left != null || cur.left.color == Color.BLACK)) {
                cur = leftRotate(cur);
                flag = true;
            }

            if (cur.left != null && cur.left.color == Color.RED && cur.left.left != null && cur.left.left.color == Color.RED) {
                cur = rightRotate(cur);
                flag = true;
            }

            if (cur.left != null && cur.left.color == Color.RED && cur.right != null && cur.right.color == Color.RED) {
                colorsSwap(cur);
                flag = true;
            }

        } while (flag);
        return cur;
    }

    public class Node {
        int value;
        Node left;
        Node right;
        Color color;
    }

    enum Color {
        BLACK,
        RED
    }
}
