package com.exercises;

import java.util.Arrays;

public class ConsecutiveNum {
    static int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);

        int count = 0;
        for (int i = 0; i < statues.length; i++) {
            if(i+1 == statues.length) {
                break;
            }
            int result = statues[i + 1] - statues[i];
            if(result > 1) {
                count+= result -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {0,3};
        System.out.println(makeArrayConsecutive2(a));
    }

}
