package com.exercises;

public class HillsAndValleys {

    static int solution(int[] A) {
        if (sameValues(A)) return 1;

        int valleys = 0;
        int hills = 0;
        for (int i = 0; i < A.length; i++) {
            if(i == 0 || i == A.length - 1) continue;

            hills += getHills(A, i);
            valleys += getValleys(A, i);
        }
        return valleys + hills;
    }

    private static int getValleys(int[] A, int i) {
        int valleys = 0;
        if(i == 0 || i == A.length - 1) {
            valleys = 0;
        };

        if(A[i] < A[i + 1] && A[i] == A[i -1]) {
            valleys++;
        }
        return valleys;
    }

    private static int getHills(int[] A, int i) {
        int hills = 0;
        if (i == 0) {
            int next = A[i + 1];
            int current = A[i];
            if (current > next) {
                hills++;
            }
        } else if (i == A.length - 1) {
            int prev = A[i - 1];
            int current = A[i];

            if (current > prev) {
                hills++;
            }
        } else {
            int prev = A[i - 1];
            int next = A[i + 1];
            int current = A[i];

            if (current > prev && current > next) {
                hills++;
            }
        }
        return hills;
    }

    private static boolean sameValues(int[] array) {
        int temp = array[0];
        boolean value = false;
        for (int a : array) {
            if(a == temp) {
                value = true;
            } else{
                value = false;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        System.out.println(solution(array));
    }
}
