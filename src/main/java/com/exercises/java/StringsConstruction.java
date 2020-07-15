package com.exercises.java;

import java.util.HashMap;
import java.util.Map;

public class StringsConstruction {
    static int stringsConstruction(String a, String b) {
        int maxString = Integer.MAX_VALUE;
        HashMap<Character, Integer> compA = getFrequencyOfChars(a.toCharArray());
        HashMap<Character, Integer> compB = getFrequencyOfChars(b.toCharArray());

        for (Map.Entry<Character, Integer> c : compA.entrySet()) {
            if(compB.containsKey(c.getKey())) {
                int multiplier = compB.get(c.getKey()) / c.getValue();
                if(maxString > multiplier) {
                    maxString = multiplier;
                }
            } else {
                maxString = 0;
            }
        }

        return maxString;
    }

    private static HashMap<Character, Integer> getFrequencyOfChars(char[] chars) {
        HashMap<Character, Integer> temp = new HashMap<>();

        for(Character c: chars) {
            temp.put(c, temp.getOrDefault(c, 0) + 1);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(        stringsConstruction("abc", "abccbac"));
    }
}
