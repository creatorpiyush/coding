package selfpractice;

import java.util.Scanner;

public class bt {

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

    public bt() {
        Scanner s = new Scanner(System.in);
        this.root = takeInputNode(s, null, false);
    }

    public Node takeInputNode(Scanner s, Node parent, boolean isLeft) {
        if (parent == null) {
            System.out.println("Enter Data For Root Node : ");
        } else {
            if (isLeft) {
                System.out.println("Enter Data For Left Child of " + parent.data + " : ");
            } else {
                System.out.println("Enter Data For Right Child of " + parent.data + " : ");
            }
        }

        int data = s.nextInt();
        Node node = new Node(data, null, null);
        this.size++;

        System.out.println("Do You Have Left Child of " + node.data + " (true or false) : ");
        boolean choice = s.nextBoolean();
        if (choice) {
            node.left = this.takeInputNode(s, node, true);
        }

        System.out.println("Do You Have Right Child of " + node.data + " (true or false) : ");
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
            System.out.print("End=>");
        }

        System.out.print(node.data);

        if (node.right != null) {
            System.out.print("<=" + node.right.data);
        } else {
            System.out.print("<=End");
        }
        System.out.println();

        if (node.left != null) {
            this.display(node.left);
        }

        if (node.right != null) {
            this.display(node.right);
        }
    }

}