package com.exercises;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    static int firstDuplicate(int[] a) {
        Set<Integer> set = new HashSet<>();
        int firstDuplicate = -1;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                return a[i];
            } else {
                set.add(a[i]);
            }
        }
        return firstDuplicate;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,1,3,5,3,2};
        System.out.println(firstDuplicate(a));
    }

}
