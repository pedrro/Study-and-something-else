package com.interviewCourse.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        selectionSort(a);
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length -1; i++) {
            int index = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }

            //swap
            int smallNum = a[index];
            a[index] = a[i];
            a[i] = smallNum;
        }

        System.out.println(a);

    }
}
