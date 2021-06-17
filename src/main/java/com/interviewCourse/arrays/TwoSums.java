package com.interviewCourse.arrays;

public class TwoSums {
    static int[] sums(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] + nums[i+1] == target) {
                    temp[0] = i;
                    temp[1] = i+1;
                    break;
                }

        }
        return temp;
    }

    public static void main(String[] args) {
        int[] a = {3,3};
        System.out.println(sums(a, 6));
    }
}
