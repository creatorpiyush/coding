package bst;

public class bstclient {

    public static void main(String[] args) {

        bst bst = new bst();

        bst.add(10);
        bst.add(5);
        bst.add(15);

        bst.display();

        System.out.println(bst.max());

    }

}