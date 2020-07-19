package com.exercises;

public class FirstNonRepeatedChar {
    static char firstNotRepeatingCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) return s.charAt(i);
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstNotRepeatingCharacter("abacabad"));
    }
}
