package com.exercises.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Access {
    public static void main(String[] args) throws Exception {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            System.out.println(num + " is " + ((Inner.Private) (o = new Inner().new Private())).powerof2(num));
            //Write your code here

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try
        catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner
}
