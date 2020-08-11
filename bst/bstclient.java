package bst;

public class bstclient {

    public static void main(String[] args) {

        bst bst = new bst();

        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(2);
        bst.add(6);

        bst.display();

        System.out.println(bst.max());
        System.out.println(bst.min());

        bst.remove(10);
        bst.display();

        bst.rootToLeaf();
    }

}