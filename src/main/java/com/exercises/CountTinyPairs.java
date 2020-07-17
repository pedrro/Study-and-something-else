package com.exercises;

public class CountTinyPairs {
    static int countTinyPairs(int[] a, int[] b, int k) {
        int isTiny = 0;
        int[] reversedB = new int[b.length];

        for (int i = 0; i < b.length; i++) {
            reversedB[i] = b[(b.length -1) - i];
        }

        for (int i = 0; i < a.length; i++) {
            if(Integer.parseInt(""+ a[i] + reversedB[i]) < k) {
                isTiny++;
            }
        }

        return isTiny;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{1,2,3};
        System.out.println(countTinyPairs(a,b,32));

    }
}