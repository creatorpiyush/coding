package queue;

public class quaclient {

    public static void main(String[] args) throws Exception {

        queueusingarray queue = new queueusingarray();

        System.out.println(queue.size());

        queue.enqueue(10);
        queue.display();
    }

}