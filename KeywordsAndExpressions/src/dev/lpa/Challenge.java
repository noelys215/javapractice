package dev.lpa;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array before reverse: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Array after reverse: " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int midpoint = array.length / 2;
        for (int i = 0; i < midpoint; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }


}
