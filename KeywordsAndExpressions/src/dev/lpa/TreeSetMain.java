package dev.lpa;

import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

//        NavigableSet<Contact> sorted = new TreeSet<>(phones);
        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println(justNames);

        NavigableSet<Contact> fullset = new TreeSet<>(sorted);
        fullset.addAll(emails);
        fullset.forEach(System.out::println);

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.sort(sorted.comparator());
        System.out.println("-".repeat(45));
        fullList.forEach(System.out::println);

        Contact min = Collections.min(fullset, fullset.comparator());
        Contact max = Collections.max(fullset, fullset.comparator());
        Contact first = fullset.first();
        Contact last = fullset.last();
        System.out.println("-".repeat(45));
        System.out.printf("min: %s, first: %s %n", min.getName(), first.getName());
        System.out.printf("max: %s, last: %s %n", max.getName(), last.getName());
        System.out.println("-".repeat(45));


        NavigableSet<Contact> copiedSet = new TreeSet<>(fullset);
        System.out.println("First El: " + copiedSet.pollFirst());
        System.out.println("Last El: " + copiedSet.pollLast());
        copiedSet.forEach(System.out::println);
        System.out.println("-".repeat(45));


        Contact daffy = new Contact("Daffy Duck");
        Contact daisy = new Contact("Daisy Duck");
        Contact snoopy = new Contact("Snoopy");
        Contact archie = new Contact("Archie");

        for (Contact c : List.of(daffy, daisy, last, snoopy)) {
            System.out.printf("ceiling(%s)=%s%n", c.getName(), fullset.ceiling(c));
            System.out.printf("higher(%s)=%s%n", c.getName(), fullset.higher(c));
        }
        System.out.println("-".repeat(45));
        for (Contact c : List.of(daffy, daisy, first, archie)) {
            System.out.printf("floor(%s)=%s%n", c.getName(), fullset.floor(c));
            System.out.printf("lower(%s)=%s%n", c.getName(), fullset.lower(c));
        }
        System.out.println("-".repeat(45));

        NavigableSet<Contact> descSet = fullset.descendingSet();
        descSet.forEach(System.out::println);
        System.out.println("-".repeat(45));


        Contact lastContact = descSet.pollLast();
        System.out.println("Removed " + lastContact);
        descSet.forEach(System.out::println);
        System.out.println("-".repeat(45));
        fullset.forEach(System.out::println);
        System.out.println("-".repeat(45));

        Contact marion = new Contact("Maid Marion");
        var headSet = fullset.headSet(marion, true);
        headSet.forEach(System.out::println);
        System.out.println("-".repeat(45));

        var tailSet = fullset.tailSet(marion, false);
        tailSet.forEach(System.out::println);
        System.out.println("-".repeat(45));

        Contact linus = new Contact("Linus Van Pelt");
        var subSet = fullset.subSet(linus, false, marion, true);
        subSet.forEach(System.out::println);
    }
}
