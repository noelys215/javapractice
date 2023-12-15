package dev.lpa;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        /* if LinkedList is empty */
        if (length == 0) {
            head = newNode;
            tail = newNode;
            /* if LinkedList has items */
        } else {
            /* Tail item equals new node */
            tail.next = newNode;
            /* Move tail pointer to new node */
            tail = newNode;
        }
        /* Increase length by one */
        length++;
    }

    public Node removeLast() {
        /* if LinkedList STARTS with 0 elements */
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        /* While temp.next doesn't equal null */
        while (temp.next != null) {
            /* Continue loop until temp.next equals null */
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        /* if LinkedList ENDS with 0 elements */
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
    }


    public boolean insert(int index, int value) {
        return false;
    }


}
