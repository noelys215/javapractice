package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String... args) {
        // LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sao Paulo");
        placesToVisit.add(0, "Rio");
//        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        // System.out.println(placesToVisit);
    /*
        gettingElements(placesToVisit);
        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);
        printItinerary4(placesToVisit);
    */

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Asuka");
        list.addLast("Shinji");
        // Queue Methods
        list.offer("Fortaleza");
        list.offerFirst("Curitiba");
        list.offerLast("Porto Alegre");
        // Stack Methods
        list.push("Campinas");
    }

    public static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Rio");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " removed");
        String s2 = list.removeFirst();
        System.out.println(s2 + " removed");
        // Queue?Deque poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " removed");
        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " removed");
        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " removed");
        //
        list.push("Campinas");
        list.push("Curitiba");
        list.push("Porto Alegre");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " removed");
    }

    public static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved: " + list.get(4));
        System.out.println("First El: " + list.getFirst());
        System.out.println("Last  El: " + list.getLast());

        System.out.println("Asuka Position: " + list.indexOf("Asuka"));
        System.out.println("Rio's Position: " + list.indexOf("Rio"));
        // Queue Retrieval Methods
        System.out.println("El from element(): " + list.element());
        // Stack Retrieval Methods
        System.out.println("El from peek(): " + list.peek());
        System.out.println("El from peekFirst(): " + list.peekFirst());
        System.out.println("El from peekLast(): " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip Start: " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("-> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip  Ends: " + list.getLast());
        System.out.println(" ");
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip Itinerary II:");
        System.out.println("Trip Start: " + list.getFirst());
        String prevTown = list.getFirst();
        for (String town : list) {
            System.out.println("-> From: " + prevTown + " to " + town);
            prevTown = town;
        }
        System.out.println("Trip  Ends: " + list.getLast());
        System.out.println(" ");
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip Itinerary III:");
        System.out.println("Start: " + list.getFirst());
        String previous = list.getFirst();
        for (String destination : list) {
            if (destination.equals(previous)) continue;
            System.out.printf(" -> Travel from %s to %s%n", previous, destination);
            previous = destination;
        }
        System.out.println("End: " + list.getLast());
        System.out.println(" ");
    }

    public static void printItinerary4(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator();

        String current = iterator.next();
        System.out.println("Trip Itinerary IV:");
        System.out.println("Start: " + current);

        while (iterator.hasNext()) {
            String previous = current;
            current = iterator.next();
            System.out.printf(" -> Travel from %s to %s%n", previous, current);
        }

        System.out.println("End: " + current);
        System.out.println(" ");
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Rio")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
