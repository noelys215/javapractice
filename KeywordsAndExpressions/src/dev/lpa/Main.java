package dev.lpa;

import dev.lpa.DataStructures.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.printList();
        myDLL.printList();
    }

}