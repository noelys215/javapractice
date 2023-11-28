package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) newArray[i] = newArray.length - i;
        for (int i = 0; i < newArray.length; i++) System.out.print(newArray[i] + " ");
        for (int element : newArray) System.out.print(element + " ");
        System.out.println(" ");
        System.out.println(Arrays.toString(newArray));
        System.out.println(" ");
        Object objectVar = newArray;

        if (objectVar instanceof int[]) System.out.println("objectVar is an int array");

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;


    }


}
