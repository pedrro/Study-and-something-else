package com.exercises;

import java.util.Arrays;

public class mutateTheArray {
    static int[] mutateTheArray(int n, int[] a) {
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            int beforeItem = 0;
            int afterItem = 0;
            int actualItem = a[i];
            if(i - 1 >= 0) {
                beforeItem = a[i-1];
            }

            if(i+1 < n) {
                afterItem = a[i+1];
            }

            newArray[i] = beforeItem + actualItem + afterItem;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{4, 0, 1, -2, 3};
        int[] ints = mutateTheArray(5, inputArray);
        Arrays.asList(ints).forEach(System.out::println);
    }
}