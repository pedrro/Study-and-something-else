package com.exercises;

public class fancyRide {
    static String fancyRide(int l, double[] fares) {
        int carIndex = 0;
        double expensiveCar = 0;
        String bestOption = "";
        for (int i = 0; i < fares.length; i++) {
            double mostFancy = l * fares[i] ;
            if(mostFancy <= 20 && mostFancy > expensiveCar ) {
                carIndex = i;
                expensiveCar = mostFancy;
            }
        }

        switch (carIndex) {
            case 0:
                bestOption = "UberX";
                break;
            case 1:
                bestOption = "UberXL";
                break;
            case 2:
                bestOption = "UberPlus";
                break;
            case 3:
                bestOption = "UberBlack";
                break;
            case 4:
                bestOption = "UberSUV";
                break;
        }
        return bestOption;
    }

    public static void main(String[] args) {
        double[] fares = new double[]{0.3, 0.5, 0.7, 1, 1.3};
        int l = 30;
        System.out.println(fancyRide(l, fares));
    }

}
