package dev.lpa;

import java.util.*;

public class MapsViewsMain {
    public static void main(String[] args) {
        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));

        Set<String> keysView = contacts.keySet();
        System.out.println(keysView);

        Set<String> copyOfKeys = new TreeSet<>(contacts.keySet());
        System.out.println(copyOfKeys);

        if (contacts.containsKey("Linus Van Pelt"))
            System.out.println("Linus and I go way back, so of course I have info");

        keysView.remove("Daffy Duck");
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        keysView.clear();
        System.out.println(contacts);
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        System.out.println(keysView);

        var values = contacts.values();
        values.forEach(System.out::println);

        values.retainAll(ContactData.getData("email"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println("-".repeat(45));
        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getNameLastFirst));
        list.forEach(c -> System.out.println(c.getNameLastFirst() + ": " + c));
    }
}
