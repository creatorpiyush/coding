package reverselinkedlist;

public class reverseclient {

    public static void main(String[] args) throws Exception {

        reverseLL ll = new reverseLL();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.display();

        System.out.println("***** reverseDI *****");
        ll.reverseDI();
        ll.display();

    }

}