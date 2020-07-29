package queue;

public class queueusingarray {

    public int[] data;
    public int front;
    public int size;

    public static final int DEFAULT_CAPACITY = 10;

    public queueusingarray() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public queueusingarray(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Invalid Capacity");
        }

        this.data = new int[capacity];
        this.front = 0;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void enqueue(int element) throws Exception {

        if (this.isEmpty()) {
            throw new Exception("Queue is Empty...");
        }

        int ai = (this.front + this.size) % this.data.length;
        this.data[ai] = element;
        this.size++;

    }

}