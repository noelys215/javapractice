package dev.lpa;


public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(11);

        myLinkedList.append(3);
        myLinkedList.append(7 * 3);
        myLinkedList.append(7);

        myLinkedList.set(1, 4);
        myLinkedList.printList();
    }


}
