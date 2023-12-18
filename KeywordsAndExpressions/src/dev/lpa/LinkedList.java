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

    public Node get(int index) {
        /* Check if Index is Valid */
        if (index < 0 || index >= length) return null;
        /* Initialize Temporary Node to Head of the List */
        Node temp = head;
        /* Moves Temp up the list to the Specified Index */
        for (int i = 0; i < index; i++) temp = temp.next;
        /* Return the Node at the Specified Index: */
        return temp;
    }

    public boolean set(int index, int value) {
        /* Retrieve the Node at the Specified Index */
        Node temp = get(index);
        /* Check If the Node Exists */
        if (temp != null) {
            /* Set the New Value and Return true */
            temp.value = value;
            return true;
        }
        /* Return false if Node Doesn't Exist */
        return false;
    }

    public boolean insert(int index, int value) {
        /* Check for Valid Index */
        if (index < 0 || index > length) return false;
        /* Handle Insertion at the Start of the List */
        if (index == 0) {
            prepend(value);
            return true;
        }
        /* Handle Insertion at the End of the List */
        if (index == length) {
            append(value);
            return true;
        }
        /* Create a new node */
        Node newNode = new Node(value);
        /* Find the Node Before the Insertion Point */
        Node temp = get(index - 1);
        /* Insert the New Node */
        newNode.next = temp.next;
        temp.next = newNode;
        /* Increment Length */
        length++;
        /* Return True */
        return true;
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

    public Node removeFirst() {
        /* Check for an Empty List */
        if (length == 0) return null;
        /* Store Head Node in temp var */
        Node temp = head;
        /* Update the Head of the List */
        head = head.next;
        /* Detach the Removed Node */
        temp.next = null;
        /* Decrement the Length */
        length--;
        /* Check if List is empty and update */
        if (length == 0) tail = null;
        /* Return the Removed Node */
        return temp;
    }

    public void prepend(int value) {
    }


}
