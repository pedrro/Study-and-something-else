package com.exercises;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Bst {
    static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList();
        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.print(current.data+ " ");
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }

    }

    static List<Node> recursive(Queue<Node> queue, List<Node> nodeList) {
        if(!queue.isEmpty()) {
            return nodeList;
        }

        Node n = queue.remove();
        if(n.left != null) queue.add(n.left);
        if(n.right != null) queue.add(n.right);

        return recursive(queue, nodeList);
    }

//    public static Node removeDuplicates(Node head) {
//        if (head == null || head.next == null){
//            return head;
//        }
//        if (head.data == head.next.data){
//            head.next = head.next.next;
//            removeDuplicates(head);
//        }else{
//            removeDuplicates(head.next);
//        }
//        return head;
//    }


//    static void levelOrder(Node root){
//        Queue<Node> queue = new LinkedList();
//        queue.add(root);
//
//        while(!queue.isEmpty()){
//            Node current = queue.remove();
//            System.out.print(current.data+" ");
//            if (current.left!=null) queue.add(current.left);
//            if (current.right!=null) queue.add(current.right);
//        }
//    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int data=sc.nextInt();
//            System.out.println(isPrime(data));
        }
    }

//    static String isPrime(int n) {
//        if(n == 1) {
//            return "Not prime";
//        }
//        if(n==2) {
//            return "Prime";
//        }
//
//        for (int i = 1; i < n; i++) {
//            if(Math.pow(i,2)+i+41 == n) {
//                return "Prime";
//            }
//        }
//
//        for(int i=2;i*i<n;i++) {
//
//            if(n%i==0)
//                return "Not prime";
//        }
//        return "Prime";
//    }

    public boolean isPrime(int number) {
        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(100);
    }
}

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

