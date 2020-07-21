import java.util.ArrayList;

/**
 * arraylist
 */
public class arraylist {

    public static void main(String[] args) {

        // * unlike array there is no boundation of length

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list); // return's empty list

        System.out.println(list.toString());

        list.add(10);
        System.out.println(list);
        System.out.println(list.size());

        list.add(20);
        System.out.println(list);
        System.out.println(list.size());

        list.add(30);
        System.out.println(list);
        System.out.println(list.size());

        list.add(40);
        System.out.println(list);
        System.out.println(list.size());

        // for (int i = 0; i < 100; i++) {
        // list.add(i);
        // }
        // System.out.println(list);

        list.set(2, 100);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}