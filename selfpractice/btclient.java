package selfpractice;

public class btclient {

    public static void main(String[] args) {

        bt tree = new bt();

        tree.display();

        System.out.println(tree.size());

        System.out.println(tree.rootnodevalue());

        System.out.println(tree.max());
        System.out.println(tree.min());

        System.out.println(tree.height());

        System.out.println(tree.ispresent(5));
    }

}