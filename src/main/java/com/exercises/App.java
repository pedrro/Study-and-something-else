package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static int diagonalDifference() {
        // Write your code here
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(11, 2, 4));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(10, 8, -12));

        int accumulator = 0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        int i = 0;
        while (i < arr.size()) {
            a.add(arr.get(i).get(i));
            i++;
        }

        int j = 0;
        while (j < arr.size()) {
            b.add(arr.get(arr.size() - j - 1).get(j));
            j++;
        }

        return Math.abs(sumIntegers(a) - sumIntegers(b));
    }

    private static Integer sumIntegers(ArrayList<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(diagonalDifference());
    }
}
