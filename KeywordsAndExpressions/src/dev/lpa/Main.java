package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printMoreLists(lpaStudents);

        testList(new ArrayList<String>(List.of("Able", "Kaine", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));

    }

    public static void testList(List<?> list) {
        for (var el : list) {
            if (el instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (el instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }


    public static void printMoreLists(List<? extends Student> students) {


        for (var student : students) System.out.println(student);
        System.out.println();

    }
}