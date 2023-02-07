package com.beginner.algorithms.linkedLists;

public class ListNodeFactory {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList(25);

        linkedList.insertAtEnd(53);
        linkedList.insertAtEnd(9);
        linkedList.insertAtEnd(17);
        linkedList.insertAtEnd(236);

        System.out.println("Nodes before remove:");
        linkedList.print();

        System.out.println("Nodes after remove:");
        linkedList.remove(3);
        linkedList.print();

    }
}
