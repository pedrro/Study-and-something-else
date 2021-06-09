package com.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class AirplaneSeatsAllocation {

    public static void main(String[] args) {

        String[] s = "1A 2F 1C".split(" ");
        int sum = Arrays.stream(s)
                .collect(Collectors.groupingBy(value -> value.substring(0, 1)))
                .values()
                .stream()
                .map(strings -> strings
                        .stream()
                        .map(s1 -> s1.charAt(1))
                        .map(s2 -> Character.getNumericValue(s2) - 10)
                        .collect(Collectors.toList()))
                .map(a -> fun(a))
                .mapToInt(i -> i)
                .sum();

        System.out.println(sum);
    }

    static int fun(List<Integer> ints){
        HashSet<Integer> used = new HashSet<>(ints);
        int families =0;
        int free =0;
        for(int i =0;i<10; i++) {
            if (used.contains(i)) {
                free = 0;
            } else {
                free++;
            }
            if (free == 3) {
                families++;
                free =0;
            }
        }
        return families;
    }
}
