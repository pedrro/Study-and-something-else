package com.exercises;

public class BinaryGap {

    private static int binaryGap(int n) {
        char[] s = Integer.toBinaryString(n).toCharArray();
        int max = 0;
        for (int i = 0; i < s.length; i++) {
            int result = 0;
            if(s[i] == '1') continue;

            for (int j = i; j < s.length ; j++) {
                if(s[j] == '0') result++;
                if(s[j] == '1') break;
            }

            if(result >= max) max = result;
        }

        if(max == s.length -1) max = 0;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(binaryGap(32));
    }
}
