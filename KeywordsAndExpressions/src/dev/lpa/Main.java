package dev.lpa;


public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);

        myLinkedList.append(2);
        myLinkedList.insert(1, 1);
        myLinkedList.insert(3, 3);
        myLinkedList.insert(5, 4);
        myLinkedList.printList();
    }


}
