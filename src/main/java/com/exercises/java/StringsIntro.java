package com.exercises.java;

import java.util.Scanner;

public class StringsIntro {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();

        int sum = a.length() + b.length();
        String aCase = snakeCase(a);
        String bCase = snakeCase(b);

        System.out.println(sum);
        System.out.println(a.compareTo(b)>0?"Yes":"No");
        System.out.println(aCase+" "+bCase);

/*
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub = S.substring(start, end);
        System.out.println(sub);
*/

    }

    private static String snakeCase(String a) {
        return a.replace(a.charAt(0), a.toUpperCase().charAt(0));
    }
}
