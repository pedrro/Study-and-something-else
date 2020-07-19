package com.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;

 }

public class isPalindrome {
    static boolean isListPalindrome(ListNode<Integer> l) {
        if(l == null) {
            return true;
        }

        List<Integer> list = new ArrayList<>();

        while(l.next != null) {
            list.add(l.value);
            l = l.next;
        }
        list.add(l.value);

        List<Integer> list2 = new ArrayList<>(list);

        boolean result = true;

        for (int i = 0; i < list.size(); i++) {
            if (!Objects.equals(list.get(i), list2.get(list.size() - i - 1))) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode<Integer> one = new ListNode<Integer>(1);
        ListNode<Integer> two1 = new ListNode<Integer>(2);
        ListNode<Integer> two2 = new ListNode<Integer>(2);
        ListNode<Integer> tres = new ListNode<Integer>(3);

        one.next = two1;
        two1.next = two2;
        two2.next = tres;

        System.out.println(isListPalindrome(one));

    }

}
