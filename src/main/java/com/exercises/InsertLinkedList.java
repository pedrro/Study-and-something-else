package com.exercises;

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode a = new SinglyLinkedListNode(data);
        if(head == null) {
            return a;
        }

        SinglyLinkedListNode current = head;

        while(current.next != null) {
            current = current.next;
        }

        current.next = a;



        return head;
    }

    public static void main(String[] args) {
//        SinglyLinkedList llist = new SinglyLinkedList();
////        Collections.
////        for (int i = 0; i < ; i++) {
////
////        }
    }
}
