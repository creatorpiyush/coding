package dynamicstack;

import stack.stackusingArray;

public class dynamicstack extends stackusingArray {

    public dynamicstack() throws Exception {
        this(DEFAULT_CAPICITY);
    }

    public dynamicstack(int capacity) throws Exception {
        super(capacity);
    }

    public void push(int element) throws Exception {

        if (this.size() == this.data.length) {
            int[] arr = new int[2 * this.data.length];
            for (int i = 0; i < this.data.length; i++) {
                arr[i] = this.data[i];
            }
            this.data = arr;
        }
        super.push(element);

    }

}