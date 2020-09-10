package com.exercises;

import java.util.ArrayList;
import java.util.HashMap;

public class AirplaneSeatsAllocation {

    static int solution(int n, String string) {
        String[] seats = string.split(" ");

        HashMap<Character, Integer> airplaneSeats = new HashMap<>();
        airplaneSeats.put('A', 0);
        airplaneSeats.put('B', 0);
        airplaneSeats.put('C', 0);

        airplaneSeats.put('D', 0);
        airplaneSeats.put('E', 0);
        airplaneSeats.put('F', 0);
        airplaneSeats.put('G', 0);

        airplaneSeats.put('H', 0);
        airplaneSeats.put('J', 0);
        airplaneSeats.put('K', 0);

        ArrayList<HashMap<Character, Integer>> rows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rows.add(airplaneSeats);
        }

        for (String seat: seats) {
            int row = Character.getNumericValue(seat.charAt(0));
            char place = seat.charAt(1);

            rows.get(row - 1).put(place, 1);
        }

        int result = 0;
        for (int row = 0; row < rows.size(); row++) {
            HashMap<Character, Integer> populatedRow = rows.get(row);

            if(populatedRow.get('A') + populatedRow.get('B') + populatedRow.get('C') == 0) {
                result++;
            }

            if(populatedRow.get('D') + populatedRow.get('E') + populatedRow.get('F') + populatedRow.get('G') <= 1) {
                result++;
            }

            if(populatedRow.get('H') + populatedRow.get('J') + populatedRow.get('K') == 0) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "1A 2F 1C";

        int solution = solution(2, s);

        System.out.println(solution);
    }
}
