package queue;

import java.util.Scanner;

public class quaclient {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        queueusingarray queue = new queueusingarray(n);

        // System.out.println(queue.size());

        for (int i = 0; i < n; i++) {
            queue.enqueue(s.nextInt());
        }

        // queue.enqueue(10);
        queue.display();

        System.out.println("***********");
        System.out.println(queue.dequque());
        queue.display();

        System.out.println("***********");
        System.out.println(queue.front());

    }

}