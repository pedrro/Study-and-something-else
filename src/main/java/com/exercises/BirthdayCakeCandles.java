package com.exercises;

import java.util.Arrays;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int highestNum = ar[ar.length-1];

        int numCount = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == highestNum) {
                numCount++;
            }
        }

        return numCount;
    }

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(new int[]{4,3,2,4}));
    }
}
