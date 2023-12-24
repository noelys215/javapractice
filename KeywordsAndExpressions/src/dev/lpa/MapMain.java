package dev.lpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("-".repeat(50));

        Map<String, Contact> contacts = new HashMap<>();
        for (Contact contact : fullList) contacts.put(contact.getName(), contact);
        contacts.forEach((k, v) -> System.out.println("KEY: " + k + ", VAL: " + v));

        System.out.println("-".repeat(50));
        System.out.println(contacts.get("Charlie Brown"));

        System.out.println(contacts.get("Chuck Brown"));
        Contact defaultContact = new Contact("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));

        System.out.println("-".repeat(50));
        contacts.clear();
        for (Contact contact : fullList) {
            Contact dupe = contacts.put(contact.getName(), contact);
            if (dupe != null) contacts.put(contact.getName(), contact.mergeContactData(dupe));
        }
        contacts.forEach((k, v) -> System.out.println("KEY: " + k + ", VAL: " + v));
        System.out.println("-".repeat(50));
        contacts.clear();
        for (Contact contact : fullList) contacts.putIfAbsent(contact.getName(), contact);
        contacts.forEach((k, v) -> System.out.println("KEY: " + k + ", VAL: " + v));

        System.out.println("-".repeat(50));
        contacts.clear();
        for (Contact contact : fullList) {
            Contact dupe = contacts.putIfAbsent(contact.getName(), contact);
            if (dupe != null) {
                contacts.put(contact.getName(), contact.mergeContactData(dupe));
            }
        }
        contacts.forEach((k, v) -> System.out.println("KEY: " + k + ", VAL: " + v));

        System.out.println("-".repeat(50));
        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact, Contact::mergeContactData));
        contacts.forEach((k, v) -> System.out.println("KEY: " + k + ", VAL: " + v));

        System.out.println("-".repeat(50));
        for (String contactName : new String[]{"Daisy Duck", "Daffy Duck", "Scrooge McDuck"})
            contacts.computeIfAbsent(contactName, k -> new Contact(k));
        contacts.forEach((k, v) -> System.out.println("KEY: " + k + ", VAL: " + v));

        System.out.println("-".repeat(50));
        for (String contactName : new String[]{"Daisy Duck", "Daffy Duck", "Scrooge McDuck"})
            contacts.computeIfPresent(contactName, (k, v) -> {
                v.addEmail("Fun Place");
                return v;
            });
        contacts.forEach((k, v) -> System.out.println("KEY: " + k + ", VAL: " + v));

        System.out.println("-".repeat(50));
        contacts.replaceAll((k, v) -> {
            String newEmail = k.replaceAll(" ", "") + "@funplace.com";
            v.replaceEmailIfExists("DDuck@funpalce.com", newEmail);
            return v;
        });
        contacts.forEach((k, v) -> System.out.println("KEY: " + k + ", VAL: " + v));
    }
}
