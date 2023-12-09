package dev.lpa;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static void main(String... args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        addPlace(placesToVisit, new Place("Adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        placesToVisit.addFirst(new Place("Sydney", 0));

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean forward = true;

        printMenu();
        String menuItem;
        while (!(menuItem = scanner.nextLine().toUpperCase()).equals("Q")) {
            switch (menuItem) {
                case "F":
                    if (!forward && iterator.hasNext()) iterator.next();
                    forward = true;
                    System.out.println(iterator.hasNext() ? iterator.next() : "Final destination reached");
                    break;
                case "B":
                    if (forward && iterator.hasPrevious()) iterator.previous();
                    forward = false;
                    System.out.println(iterator.hasPrevious() ? iterator.previous() : "At the starting point");
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.stream().noneMatch(p -> p.name().equalsIgnoreCase(place.name()))) {
            list.add(place);
            list.sort(Comparator.comparingInt(Place::distance));
        } else {
            System.out.println("Dupe Found: " + place);
        }
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
