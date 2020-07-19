package com.exercises;

public class FareEstimation {
    double[] fareEstimator(int ride_time, int ride_distance, double[] cost_per_minute, double[] cost_per_mile) {
        double[] a = new double[cost_per_minute.length];

        for (int i = 0; i < cost_per_minute.length; i++){
            a[i] = ((cost_per_minute[i] * ride_time) + (cost_per_mile[i] * ride_distance));
        }

        return a;
    }

    public static void main(String[] args) {

    }
}
