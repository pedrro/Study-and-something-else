package com.exercises;

public class CyclicRotation {

    public static int[] solution(int[] A, int K) {
        int i = 0;

        while(i < K) {
            A = rotate(A);
            i++;
        }

        return A;
    }

    private static int[] rotate(int[] a) {
        int[] temp = new int[a.length];

        for (int j = 0; j < a.length; j++) {
            if(j == a.length - 1) {
                temp[0] = a[j];
            } else {
                temp[j+1] = a[j] ;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] solution = solution(array, 3);

        System.out.println(solution);

    }
}
