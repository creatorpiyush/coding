package dynamicqueue;

import queue.queueusingarray;

public class dynamicqueue extends queueusingarray {

    public dynamicqueue() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public dynamicqueue(int capacity) throws Exception {
        super(capacity);
    }

    public void enqueue(int element) throws Exception {
        if (this.data.length == this.size()) {
            int[] arr = new int[2 * this.data.length];
            for (int i = 0; i < this.size(); i++) {
                arr[i] = this.data[(this.front + i) % this.data.length];
            }
            this.data = arr;
            this.front = 0;
        }
        super.enqueue(element);
    }

}