package dev.lpa;

public interface Series {
    int MAX = 10;
    String ERROR_MSG = "Limit Reached";

    int getNext();

    default void printStuff() {
        System.out.println("Printing Stuff");
        printMoreStuff();
    }

    private void printMoreStuff() {
        System.out.println("More Stuff...");
    }

}
