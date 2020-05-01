package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long sum = 0;
        ArrayList<Long> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += 0;
                } else {
                    sum += arr[j];
                }
            }
            list.add(sum);
            sum = 0;
        }
        System.out.println(list);
        System.out.println(list.get(list.size() -1) + " " + list.get(0));
    }

    public static void main(String[] args) {
        miniMaxSum(new int[]{396285104, 573261094, 759641832, 819230764, 364801279});
    }
}
