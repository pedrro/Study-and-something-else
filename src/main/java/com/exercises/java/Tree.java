package com.exercises.java;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Tree {
    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node q = queue.poll();
            System.out.print(q.data + " ");
            if(q.left != null) {
                queue.add(q.left);
            }
            if(q.right != null) {
                queue.add(q.right);
            }
        }
    }

    static boolean checkBST(Node root) {
        if(root == null){
            return true;
        }

        if(root.left != null  && root.data < root.left.data) {
            return false;
        }
        if(root.right != null  && root.data > root.right.data) {
            return false;
        }
        Boolean l = checkBST(root.left);

        Boolean r = checkBST(root.right);

        return l == false ? l : r;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        //1
        //2
        //5
        //3 6
        //4
        Node head = insert(null, 1);
        Node dois = insert(head, 2);
        Node cinco = insert(dois, 5);
        Node tres = insert(cinco, 3);
        insert(cinco, 6);
        insert(tres, 4);

        System.out.println("pre");
        preOrder(head);
        System.out.println("");

        System.out.println("pos");
        postOrder(head);
        System.out.println("");

        System.out.println("in order");
        inOrder(head);
        System.out.println("");

        System.out.println("level order");
        levelOrder(head);
        System.out.println("");

        System.out.println("is bst?");
        System.out.println(checkBST(head));
        System.out.println("");

    }

}
