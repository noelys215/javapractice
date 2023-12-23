package dev.lpa;


import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String name = "Asuka ";
        Function<String, String> uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String, String> lastName = s -> s.concat(" Langley");
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));

        Function<String, String[]> f0 = uCase
                .andThen(s -> s.concat("Langley"))
                .andThen(s -> s.split(" "));
        System.out.println("\n" + Arrays.toString(f0.apply(name)));

        Function<String, String> f1 = uCase
                .andThen(s -> s.concat("Langley"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0]);
        System.out.println("\n" + f1.apply(name));


        Function<String, Integer> f2 = uCase
                .andThen(s -> s.concat("Langley"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0])
                .andThen(s -> String.join(", ", s))
                .andThen(String::length);
        System.out.println("\n" + f2.apply(name));
        System.out.println(" ");
        String[] names = {"Shinji", "Asuka", "Rei"};
        Consumer<String> s0 = s -> System.out.print(s.charAt(0));
        Consumer<String> s1 = System.out::println;

        Arrays.asList(names).forEach(s0
                .andThen(s -> System.out.print(" - "))
                .andThen(s1));

        Predicate<String> p1 = s -> s.equals("Asuka");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("Asuka");
        Predicate<String> p3 = s -> s.startsWith("A");
        Predicate<String> p4 = s -> s.endsWith("a");

        Predicate<String> combined1 = p3.or(p4);
        System.out.println("\n" + "Combined: " + combined1.test(name));
    }

}
