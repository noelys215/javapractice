package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));
        for (String s : list) System.out.println(s);
        System.out.println("-------");
        list.forEach(s -> System.out.println(s));

        int result = calculator((a, b) -> a + b, 5, 2);
        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
    }

    public static <T> T calculator(Operation<T> function, T val1, T val2) {
        T result = function.operate(val1, val2);
        System.out.println("Operation Result: " + result);
        return result;
    }
}