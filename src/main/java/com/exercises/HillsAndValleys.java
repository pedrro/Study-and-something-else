package com.exercises;

public class HillsAndValleys {

    static int solution(int[] A) {
        if (sameValues(A)) return 1;

        int hills = identifyHills(A);
        int valleys = identifyValleys(A);
        return hills + valleys;
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

    private static int identifyValleys(int[] a) {
        int valleys = 0;
        for (int i = 0; i < a.length; i++) {
            if(i == 0 || i == a.length - 1) continue;
            if(a[i] < a[i + 1] && a[i] == a[i-1]){
                valleys++;
            }
        }

        return valleys;
    }

    private static int identifyHills(int[] a) {
        int hills = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                int next = a[i + 1];
                int current = a[i];
                if (current > next) {
                    hills++;
                }
            } else if (i == a.length - 1) {
                int prev = a[i - 1];
                int current = a[i];

                if (current > prev) {
                    hills++;
                }
            } else {
                int prev = a[i - 1];
                int next = a[i + 1];
                int current = a[i];

                if (current > prev && current > next) {
                    hills++;
                }
            }

        }
        return hills;
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        System.out.println(solution(array));
    }
}
