package com.exercises;

public class Staircase {
    static void staircase(int n) {
        int count = 1;

        while(count <= n) {
            StringBuilder staircaseLine = new StringBuilder();
            int countSpaces = count - n;
            while (countSpaces < 0) {
                staircaseLine.append(" ");
                countSpaces++;
            }

            for (int i = 0; i < count ; i++) {
                staircaseLine.append("#");
            }
            count++;
            System.out.println(staircaseLine.toString());
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
