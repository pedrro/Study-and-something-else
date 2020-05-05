package com.exercises;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        double negative = 0;
        double positive = 0;
        double zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative++;
            } else if (arr[i] == 0) {
                zero++;
            } else {
                positive++;
            }
        }

        System.out.println(positive / arr.length);
        System.out.println(negative / arr.length);
        System.out.println(zero / arr.length);
    }

    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = -4;
        a[1] = 3;
        a[2] = -9;
        a[3] = 0;
        a[4] = 4;
        a[5] = 1;
        plusMinus(a);
    }
}
