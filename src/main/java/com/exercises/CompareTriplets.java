package com.exercises;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int p1 = 0;
        int p2 = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                p1++;
            }else if(a.get(i) < b.get(i)) {
                p2++;
            }
        }

        result.add(p1);
        result.add(p2);
        return result;
    }
}
