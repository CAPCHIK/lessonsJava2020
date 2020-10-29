package ru.capchik.ivbo_11_19.lesson9;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(12);
        Node node2 = new Node(15);
        node1.setNext(node2);

        printList(node1);

        addToEnd(node1, 150);
        printList(node1);

    }
    private static void printList(Node head) {
        while (head != null) {
            System.out.println(head.getValue());
            head = head.getNext();
        }
    }
    private static void addToEnd(Node head, int value) {
        Node tail = head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
        }
        Node newTail = new Node(value);
        tail.setNext(newTail);
    }
}
