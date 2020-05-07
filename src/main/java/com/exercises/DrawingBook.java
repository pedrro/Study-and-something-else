package com.exercises;

public class DrawingBook {
    static int pageCount(int n, int p) {

        int totalPages = n / 2;
        int targetPageFront = p / 2;
        int targetPageBack = totalPages - targetPageFront;

        return Math.min(targetPageFront, targetPageBack); //fail 26
    }

    public static void main(String[] args) {
        System.out.println(pageCount(5, 4));
    }
}
