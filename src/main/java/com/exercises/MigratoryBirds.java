package com.exercises;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {
        int[] temp = new int[6];

        arr.forEach(i -> temp[i]++);

        int maxValue = 0;
        for (int value : temp) {
            if (value > maxValue) {
                maxValue = value;
            }

        }
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < temp.length ; i++) {
            if(temp[i] == maxValue) {
                a.add(i);
            }
        }

        return a.get(0);
    }

    public static void main(String[] args) {
        List<Integer> birds = new ArrayList<>();
        birds.add(1);
        birds.add(4);
        birds.add(4);
        birds.add(4);
        birds.add(5);
        birds.add(3);
        birds.add(3);
        birds.add(3);
        System.out.println(migratoryBirds(birds));
    }
}
