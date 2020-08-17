package stack;

public class stackusingArray {

    public int[] data;
    public int tos;

    public static final int DEFAULT_CAPICITY = 10;

    public stackusingArray() throws Exception {
        this(DEFAULT_CAPICITY);
    }

    public stackusingArray(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Invalid Capacity...");
        }

        this.data = new int[capacity];
        this.tos = -1;

    }

    public int size() {
        return this.tos + 1;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push(int element) throws Exception {

        if (this.size() == this.data.length) {
            throw new Exception("Stack is full...");
        }

        this.tos++;
        this.data[this.tos] = element;

    }

    public int pop() throws Exception {

        if (this.isEmpty()) {
            throw new Exception("Stack is Empty...");
        }
        int rv = this.data[this.tos];
        this.data[this.tos] = 0;
        this.tos--;
        return rv;

    }

    public int top() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty...");
        }
        int rv = this.data[this.tos];
        return rv;
    }

    public void display() {
        for (int i = this.tos; i >= 0; i--) {
            System.out.print(this.data[i] + " , ");
        }
        System.out.println("END");
    }

}