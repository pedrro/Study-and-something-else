package com.exercises.java;

public class ReverseString {
    public static void main(String[] args) {
        String a = "madam";
        char[] arrayString = a.toCharArray();
        String reversed = "";

        for (int i = 0; i <arrayString.length; i++) {
            reversed += "" + arrayString[arrayString.length - (i+1)];
        }

        if(a.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
