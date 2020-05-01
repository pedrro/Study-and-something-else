package com.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class NestedLogic {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String actualDate = sc.nextLine();
        String expectedDate = sc.nextLine();

        System.out.println(getCalculateFee(actualDate, expectedDate));

    }

    private static int getCalculateFee(String actualDate, String expectedDate) {
        int[] splittedActualDate = convertToIntArray(actualDate);
        int[] splittedExpectedDate = convertToIntArray(expectedDate);


//        if(splittedActualDate[0] <= splittedExpectedDate[0] &&
//            splittedActualDate[1] <= splittedExpectedDate[1] &&
//            splittedActualDate[2] <= splittedExpectedDate[2]) {
//            return 0;
//        }

        if(splittedActualDate[0] >= splittedExpectedDate[0] &&
                splittedActualDate[1] == splittedExpectedDate[1]) {
            return 15 * (splittedActualDate[0] - splittedExpectedDate[0]);
        }
        if(splittedActualDate[1] >= splittedExpectedDate[1] &&
                splittedActualDate[2] == splittedExpectedDate[2]) {
            return 500 * (splittedActualDate[1] - splittedExpectedDate[1]);
        }

        if(splittedActualDate[2] > splittedExpectedDate[2]) {
            return 10000;
        }

        return 0;
    }

    private static int[] convertToIntArray(String actualDate) {
        return Arrays.stream(actualDate.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
