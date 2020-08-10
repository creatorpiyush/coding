package binarytree;

public class btclient {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.display();

        System.out.println(tree.size());

        System.out.println(tree.height());

        System.out.println(tree.max());

        System.out.println(tree.min());

    }

}