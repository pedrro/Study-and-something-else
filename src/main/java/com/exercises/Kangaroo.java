package com.exercises;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2) {
            int i = (x2 - x1) % (v1 - v2);

            return i == 0 ? "YES" : "NO";

        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }
}
