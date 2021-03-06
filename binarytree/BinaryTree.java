package binarytree;

import java.util.Scanner;

/**
 * binarytree
 */
public class BinaryTree {

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    private int size;

    public BinaryTree() {
        Scanner s = new Scanner(System.in);
        this.root = this.takeInputNode(s, null, false);
    }

    public Node takeInputNode(Scanner s, Node parent, boolean isLeftOrRight) {

        if (parent == null) {
            System.out.println("Enter the data for the root node :- ");
        } else {
            if (isLeftOrRight) {
                System.out.println("Enter the data for the left child of " + parent.data);
            } else {
                System.out.println("Enter the data for the right child of " + parent.data);
            }
        }

        int data = s.nextInt();
        Node node = new Node(data, null, null);
        this.size++;

        System.out.println("Do you have left child of " + node.data);
        boolean choice = s.nextBoolean();
        if (choice) {
            node.left = this.takeInputNode(s, node, true);
        }

        System.out.println("Do you have right child of " + node.data);
        choice = s.nextBoolean();
        if (choice) {
            node.right = this.takeInputNode(s, node, false);
        }

        return node;
    }

    public void display() {
        this.display(this.root);
    }

    private void display(Node node) {
        if (node.left != null) {
            System.out.print(node.left.data + "=>");
        } else {
            System.out.print("END=>");

        }
        System.out.print(node.data);
        if (node.right != null) {
            System.out.print("<=" + node.right.data);
        } else {
            System.out.print("<=END");

        }
        System.out.println();
        if (node.left != null) {
            this.display(node.left);
        }

        if (node.right != null) {
            this.display(node.right);
        }

    }

    public int size() {
        return this.size(this.root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }

        int lsize = this.size(node.left);
        int rsize = this.size(node.right);
        int mysize = lsize + rsize + 1;
        return mysize;

    }

    public int height() {
        return this.height(this.root);
    }

    private int height(Node node) {

        if (node == null) {
            return -1;
        }

        int lheight = this.height(node.left);
        int rheight = this.height(node.right);
        int height = Math.max(lheight, rheight) + 1;
        return height;

    }

    public int max() {
        return this.max(this.root);
    }

    private int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int lmax = this.max(node.left);
        int rmax = this.max(node.right);
        return Math.max(node.data, Math.max(lmax, rmax));
    }

    public int min() {
        return this.min(this.root);
    }

    private int min(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        int lmin = this.min(node.left);
        int rmin = this.min(node.right);
        return Math.min(node.data, Math.min(lmin, rmin));
    }

    public boolean ispresent(int data) {
        return this.ispresent(data, this.root);
    }

    private boolean ispresent(int data, Node node) {
        if (node == null) {
            return false;
        }

        if (node.data == data) {
            return true;
        } else if (this.ispresent(data, node.left)) {
            return true;
        } else if (this.ispresent(data, node.right)) {
            return true;
        } else {
            return false;
        }
    }

}