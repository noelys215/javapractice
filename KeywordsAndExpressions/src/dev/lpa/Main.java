package dev.lpa;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        /* (2) Items - Returns 2 Nodes */
        System.out.println(myLinkedList.removeLast().value);
        /* (1) Item - Returns 1 Nodes */
        System.out.println(myLinkedList.removeLast().value);
        /* (0) Items - Returns 1 Null */
        System.out.println(myLinkedList.removeLast());
    }


}
