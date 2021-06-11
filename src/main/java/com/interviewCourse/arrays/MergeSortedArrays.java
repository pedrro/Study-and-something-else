package com.interviewCourse.arrays;

public class MergeSortedArrays {
    static int[] merge(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = b[j++];
            }
        }

        while(i < a.length) {
            temp[k++] = a[i++];
        }

        while(j < b.length) {
            temp[k++] = b[j++];
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] a = {0,3,4,8,14,31};
        int[] b = {4,6,20,29,30};
        System.out.println(merge(a, b));
    }
}
