package Lects.Lect4;

import java.util.ArrayList;
import java.util.List;

public class ex_1_Tree {
    Node root; //корень от которого "растёт" дерево

    public static void main(String[] args) {

    }


    /*
    private Node find(Node node, int value) {
        if (node.value == value)
            return node;
        else {
            for (Node child : node.children) {
                Node result = find(child, value);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    public boolean exist(int value) {
        if (root != null) {
            Node node = find(root, value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }
    */
    public Node find(int value){
        List<Node> line = new ArrayList<>();
        line.add(root);
        while(line.size() > 0){
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value){
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }



    public class Node {
        int value;
        List<Node> children;
    }
}
