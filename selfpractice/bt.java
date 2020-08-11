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

    public int size() {
        return this.size(this.root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }

        int lsize = this.size(node.left);
        int rsize = this.size(node.right);
        return lsize + rsize + 1;
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

    public int rootnodevalue() {
        return this.rootnodevalue(this.root);
    }

    private int rootnodevalue(Node node) {
        return node.data;
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
        return Math.max(lheight, rheight) + 1;
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

    public void mirror() {
        this.mirror(this.root);
    }

    private void mirror(Node node) {
        if (node == null) {
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        this.mirror(node.left);
        this.mirror(node.right);
    }

    public void preOrder() {
        this.preOrder(this.root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        this.inOrder(this.root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        this.postOrder(this.root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public boolean isBST() {
        return this.isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data < min || node.data > max) {
            return false;
        } else if (!this.isBST(node.left, min, node.data)) {
            return false;
        } else if (!this.isBST(node.right, node.data, max)) {
            return false;
        } else {
            return true;
        }
    }

    public int diameter() {
        return diameter(this.root);
    }

    private int diameter(Node node) {
        if (node == null) {
            return 0;
        }

        int mydia = height(node.left) + height(node.right) + 2;
        int leftdia = diameter(node.left);
        int rightdia = diameter(node.right);

        return Math.max(mydia, Math.max(leftdia, rightdia));

    }

    public void rootToLeaf() {
        this.rootToLeaf(this.root, "");
    }

    private void rootToLeaf(Node node, String osf) {
        if (node == null) {
            return;
        }

        osf = osf + node.data + ", ";
        if (node.left == null && node.left == null) {
            System.out.println(osf + "End");
            return;
        }

        rootToLeaf(node.left, osf);
        rootToLeaf(node.right, osf);
    }

}