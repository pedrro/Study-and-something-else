package com.exercises;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        char[] chars = s.toCharArray();
        int numOfA = 0;
        for (char c : chars) {
            if(c == 'a') {
                numOfA++;
            }
        }
        long groupOfCharsByString = n / chars.length;
        long result = 0;
        long missingCharsByN = n % chars.length;
        if(missingCharsByN == 0) {
            result = groupOfCharsByString * numOfA;
        } else {
            int complementaryA = 0;
            for (int i = 0; i < missingCharsByN; i++) {
                if(chars[i] == 'a') {
                    complementaryA++;
                }
            }

            result = (groupOfCharsByString * numOfA) + complementaryA;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }

}
