package com.interviewCourse.hashTable;

import java.util.HashMap;

public class FirstRecurringNumber {

    public static void main(String[] args) {
        int[] a = {2, 2, 3,3};

        System.out.println(firstRecurringNumber(a));
    }

    private static int firstRecurringNumber(int[] a) {
        HashMap<Integer, Integer> recurringNumbers = new HashMap<>();

        for (int v : a) {
            if (recurringNumbers.containsKey(v)) {
                recurringNumbers.putIfAbsent(v, recurringNumbers.get(v) + 1);
                return v;
            } else {
                recurringNumbers.putIfAbsent(v, 0);
            }
        }

        return 0;
    }
}
