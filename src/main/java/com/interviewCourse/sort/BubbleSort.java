package com.interviewCourse.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        bubbleSort(a);
    }

    private static int[] bubbleSort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                if (i + 1 == a.length) {
                    break;
                }
                //swap
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }

        return a;
    }
}
