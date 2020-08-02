package linkedlist;

public class llclient {

    public static void main(String[] args) throws Exception {

        linkedlist ll = new linkedlist();

        ll.addFirst(10);
        ll.addFirst(20);

        ll.addLast(30);

        ll.display();

        System.out.println(ll.getFirst());

    }

}