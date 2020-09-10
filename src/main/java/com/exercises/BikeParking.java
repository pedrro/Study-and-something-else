package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class BikeParking {

    static int solution(int[] A){
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> emptyParks = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = A[0]; i < A[A.length-1]; i++) {
            int value = i;
            if(Arrays.stream(A).anyMatch(el -> el == value)) {
                continue;
            } else {

                temp.add(i);
                if(Arrays.stream(A).anyMatch(el -> el == value+1)) {
                    emptyParks.add(temp);
                    temp = new ArrayList<>();
                }
            }
        }

        int higher = 0;
        for (ArrayList<Integer> group: emptyParks){
            if(group.size() > higher) {
                higher = group.size();
            }
        }

        return higher / 2;
    }

    public static void main(String[] args) {
        int[] array = {10, 0, 8, 2, -1, 12, 11, 3};
        System.out.println(solution(array));
    }
}
