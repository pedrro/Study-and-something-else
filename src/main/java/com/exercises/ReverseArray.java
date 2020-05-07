package com.exercises;

public class ReverseArray {
    static int[] reverseArray(int[] a) {
        int[] temp = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            temp[i] = a[a.length - (i+1)];
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 3, 2};
        System.out.println(reverseArray(a));
    }
}
