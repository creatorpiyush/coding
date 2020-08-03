package linkedlist;

public class llclient {

    public static void main(String[] args) throws Exception {

        linkedlist ll = new linkedlist();

        System.out.println("********************");
        System.out.println("Adding element");

        ll.addFirst(10);
        ll.addFirst(20);

        ll.addLast(30);

        ll.addAt(2, 55);

        ll.display();

        System.out.println("********************");
        System.out.println("Size of List");
        System.out.println(ll.size());

        System.out.println("********************");
        System.out.println("Getting element");

        System.out.println(ll.getFirst());

        System.out.println(ll.getLast());

        System.out.println(ll.getAt(0));
        System.out.println(ll.getAt(2));
        System.out.println(ll.getAt(ll.size() - 1));

        System.out.println("********************");
        System.out.println("Removing element");

        System.out.println(ll.removeFirst());
        ll.display();
        System.out.println(ll.removeLast());
        ll.display();
        System.out.println(ll.removeAt(1));
        ll.display();

    }

}