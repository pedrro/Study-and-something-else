package com.exercises;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {
    static void bonAppetit(List<Integer> bill, int k, int b) {


        int totalBill = 0;

        bill.remove(k);
        for (Integer integer : bill) {
            totalBill += integer;
        }

        int bc = totalBill / 2;
        String result = b - bc == 0 ? "Bon Appetit" : Integer.valueOf(b - bc).toString();
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<Integer> billItems = new ArrayList<>();
        billItems.add(3);
        billItems.add(10);
        billItems.add(2);
        billItems.add(9);

        bonAppetit(billItems, 1, 12);
    }
}
