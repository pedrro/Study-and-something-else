package com.exercises.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";

        List<String> subs = new ArrayList<>();

        for (int i = 0; i + k <= s.length(); i++) {
            String substring = s.substring(i, i + k);
            subs.add(substring);
        }

        List<String> sortedList = subs.stream().sorted().collect(Collectors.toList());

        smallest = sortedList.get(0);
        largest = sortedList.get(sortedList.size() - 1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
