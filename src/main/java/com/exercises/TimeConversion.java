package com.exercises;

import java.util.Arrays;

public class TimeConversion {
    static String timeConversion(String s) {
        String[] chars = s.split("");
        String[] split = s.split(":");

        if(chars[8].equals("P") && split[0].equals("12")) {
            split[0] = split[0];
        } else if(chars[8].equals("P")) {
            String hours = split[0];
            split[0] = String.valueOf(12 + Integer.parseInt(hours));
        } else if(chars[8].equals("A") && split[0].equals("12")) {
            split[0] = "00";
        }

        String format = "hh:mm:ss".replace("hh", split[0])
                .replace("mm", split[1])
                .replace("ss", split[2]).replace("PM", "").replace("AM", "");
        return format;

    }
    public static void main(String[] args) {
        System.out.println(timeConversion("12:40:03PM"));
    }
}
