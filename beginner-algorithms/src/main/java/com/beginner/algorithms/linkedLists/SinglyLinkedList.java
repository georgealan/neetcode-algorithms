package com.beginner.algorithms.linkedLists;

public class SinglyLinkedList {
    ListNode head;
    ListNode tail;

    public SinglyLinkedList(int value) {
        head = new ListNode(value);
        tail = head;
    }

    public void insertAtEnd(int value) {
        tail.next = new ListNode(value);
        tail = tail.next;
    }

    public void remove(int index) {
        int i = 0;
        ListNode current = head;
        while (i < index && current != null) {
            i++;
            current = current.next;
        }

        // Remove the node ahead of current
        if (current != null) {
            current.next = current.next.next;
        }
    }

    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println();
    }
}