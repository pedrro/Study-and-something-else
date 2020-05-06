package com.exercises.java;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = a;
            for (int k = 0; k < n; k++) {
                result = (int) Math.pow(2, k) * b + result;
                System.out.print(result + " ");
            }
            System.out.println();

        }
        in.close();


    }
}
