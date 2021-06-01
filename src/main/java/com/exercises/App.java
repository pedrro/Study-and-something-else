package com.exercises;

//TASK: Given a string, find the length of the longest substring without repeating characters.
// Example Input: s = "abcabcdbb"
// In this example, you’ll find 4 substrings (or subsets of characters) without any repeating characters. These are “abc”, “abcd”, “b”, “b”. The longest is “abcd”, so the answer is 4.
// Another example:
// Example Input: s = "pwwkew"
// The longest substring is “wke”, so the answer is 3.

public class App {

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        String temp = "";
        char[] stringArray = s.toCharArray();

        // Write your code here
        for(int i = 0; i < stringArray.length; i++) {
            if(!temp.contains(String.valueOf(stringArray[i]))) {
                temp += stringArray[i];
            } else {
                if (length < temp.length()) {
                    length = temp.length();
                }
                temp = String.valueOf(stringArray[i]);
            }
        }

        return length == 0 ? s.length() : length;
    }

    public static void main(String[] arg) {
        int result = lengthOfLongestSubstring("abcd");
        System.out.println(result);
    }
}
