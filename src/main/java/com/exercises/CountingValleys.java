package com.exercises;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int valleys = 0;
        int lvl = 0;

        for (char c : s.toCharArray()) {
            if (c == 'U') {
                lvl++;
            } else {
                lvl--;
            }

            if (lvl == 0 && c == 'U') {
                valleys++;
            }
        }


        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }
}
