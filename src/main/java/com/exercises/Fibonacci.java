package com.exercises;

import java.util.HashMap;

public class Fibonacci {
    static HashMap<Integer, Integer> cache = new HashMap<>();
    static int fibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return fibonacci(n -1) + fibonacci(n - 2);
    }

    static int cachedFibonacci(int n, HashMap<Integer, Integer> c) {
        if(c.containsKey(n)) {
            return c.get(n);
        } else {
            if(n < 2) {
                return n;
            } else {
                c.put(n, cachedFibonacci(n -1, c) + cachedFibonacci(n - 2, c));
                return c.get(n);
            }
        }

    }



    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        System.out.println(cachedFibonacci(8, cache));
    }
}
