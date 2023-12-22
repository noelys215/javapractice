package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();


    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Carole", "David", "Ed", "Ava", "Fred", "Gary"};

        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("-> Uppercase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
        System.out.println("-> Random Initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        System.out.println("-> Reverse Name as Last Name");
        Arrays.asList(names).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(
                s.substring(s.lastIndexOf(" ") + 1)
        ));
        System.out.println("\n");
        newList.forEach(s -> System.out.println(s));
    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    private static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }

}
