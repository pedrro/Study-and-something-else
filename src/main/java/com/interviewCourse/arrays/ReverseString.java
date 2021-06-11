package com.interviewCourse.arrays;

public class ReverseString {
    static String reverse(String s) {
        char[] chars = s.toCharArray();
        char[] temp = new char[chars.length];

        for (int i = chars.length; i >= 0; i--) {
            if(i == 0) {
                break;
            }
            temp[chars.length - i] = chars[i -1];
        }

        String result = "";
        for (char c: temp) {
            result+= c;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse("pedro"));
    }
}
