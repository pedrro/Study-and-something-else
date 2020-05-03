package com.exercises;

public class BreakingRecords {
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int[] bestAndWorst = new int[2];
        int highestScore = scores[0];
        int bestCount = 0;

        int worstScore = scores[0];
        int worstCount = 0;

        for (int score :scores) {
            if(score > highestScore) {
                highestScore = score;
                bestCount++;
            }

            if(score < worstScore) {
                worstScore = score;
                worstCount++;
            }
        }
        bestAndWorst[0] = bestCount;
        bestAndWorst[1] = worstCount;

        return bestAndWorst;
    }

    public static void main(String[] args) {
//        int[] scores = new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] scores = new int[]{0, 9, 3, 10, 2, 20};

        for (int score: breakingRecords(scores)) {
            System.out.println(score);

        }
    }
}
