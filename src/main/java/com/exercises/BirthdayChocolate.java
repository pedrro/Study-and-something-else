package com.exercises;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {
    static int birthday(List<Integer> s, int day, int month) {
        List<ArrayList<Integer>> subList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < s.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < month; j++) {
                if(i+j < s.size()){
                    temp.add(s.get(i+j));
                }
            }
            subList.add(temp);
        }
        long count = subList.stream()
                .filter(list -> (list.size() == month) && (list.stream().mapToInt(Integer::intValue).sum() == day))
                .count();

        return (int) count;
    }

    public static void main(String[] args) {
        List<Integer> pieces = new ArrayList<>();
        pieces.add(1);
        pieces.add(2);
        pieces.add(1);
        pieces.add(3);
        pieces.add(2);
        System.out.println(birthday(pieces, 3, 2));
    }
}
