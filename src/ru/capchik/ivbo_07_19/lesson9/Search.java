package ru.capchik.ivbo_07_19.lesson9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    private Node left;
    private Node right;
    private int number;

    public Node(int number) {
        this.number = number;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    public int getNumber() {
        return number;
    }
}

public class Search {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.setLeft(new Node(2));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));
        root.setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(7));
        printAll(root);
    }

    private  static void printAll(Node node) {
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(node);
        while (!nodes.isEmpty()) {
            Node currentNode = nodes.remove();
            System.out.println(currentNode.getNumber());
            if (currentNode.getLeft() != null) {
                nodes.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                nodes.add(currentNode.getRight());
            }

        }
    }
}
