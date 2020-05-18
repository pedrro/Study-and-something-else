package com.exercises.java;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();

        System.out.println(n.isProbablePrime(1) ? "Prime": "Not Prime");
        scanner.close();
    }
}
