package dynamicqueue;

import queue.queueusingarray;

public class dynamicqueueclient {

    public static void main(String[] args) throws Exception {

        queueusingarray queue = new dynamicqueue(5);

        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i * 10);
            displayQueuesinfo(queue);
        }

    }

    public static void displayQueuesinfo(queueusingarray queue) throws Exception {
        System.out.println("************************");
        queue.display();
        System.out.println("Front=>" + queue.front());
        System.out.println("Size=>" + queue.size());
        System.out.println("************************");
    }

}