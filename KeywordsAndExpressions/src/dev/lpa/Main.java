package dev.lpa;

import java.util.LinkedList;

public class Main {
    public static void main(String... args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sao Paulo");
        placesToVisit.add(0, "Rio");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);
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
}
