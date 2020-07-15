package com.exercises;

public class AdjacentElementProduct {

    static int adjacentElementsProduct(int[] inputArray) {
        int highestProduct = -1000;

        for(int i = 0; i < inputArray.length -1; i++) {
            int adjacentElementsProduct = inputArray[i] * inputArray[i+1];
            System.out.println(adjacentElementsProduct);

            if( adjacentElementsProduct > highestProduct) {
                highestProduct = adjacentElementsProduct;
            }
        }

        return highestProduct;
    }

    public static void main(String[] args) {

        int[] inputArray = new int[]{-23, 4, -3, 8, -12};
        System.out.println(adjacentElementsProduct(inputArray));
    }
}
