package com.exercises.java;

import java.util.Scanner;

import static java.util.Arrays.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array= new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        int negativeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            int max = 0;
            while (max <= array.length) {
                int sum = stream(array, i, max).sum();

                if (sum < 0) {
                    negativeNumbers++;
                }
                max++;
            }
        }

        System.out.println(negativeNumbers);
    }
}
