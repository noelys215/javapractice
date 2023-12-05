package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();

        while (true) {
            printActions();
            int action = Integer.parseInt(scanner.nextLine());
            if (action == 0) break;

            switch (action) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
            }

            groceries.sort(String::compareTo);
            System.out.println("Current Grocery List: " + groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Enter items to add (comma-separated):");
        ArrayList<String> itemsToAdd = parseInput();
        for (String item : itemsToAdd) {
            if (!groceries.contains(item)) {
                groceries.add(item);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Enter items to remove (comma-separated):");
        ArrayList<String> itemsToRemove = parseInput();
        groceries.removeAll(itemsToRemove);
    }

    private static ArrayList<String> parseInput() {
        String[] items = scanner.nextLine().split(",");
        ArrayList<String> itemList = new ArrayList<>();
        for (String item : items) {
            itemList.add(item.trim());
        }
        return itemList;
    }

    private static void printActions() {
        System.out.println("""
                Available actions:
                0 - to shutdown
                1 - to add items to the list
                2 - to remove items from the list
                Choose an action:""");
    }
}
