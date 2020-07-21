package com.exercises;

import java.util.ArrayList;
import java.util.List;

public class FindMiddleElement {
    int findMiddleElement(ListNode<Integer> l) {
        int elementIndex = 0;
        List<ListNode<Integer>> temp = new ArrayList();

        while(l.next != null) {
            temp.add(l);
            elementIndex++;
            l = l.next;
        }
        temp.add(l);

        int elementToBeReturned = 0;
        if(elementIndex == 0) {
            elementToBeReturned = l.value;
        } else {
            elementToBeReturned = temp.get(elementIndex % 2 == 0 ? (elementIndex / 2) : (elementIndex / 2) + 1).value;
        }

        return elementToBeReturned;
    }
}