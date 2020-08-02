package linkedlist;

public class linkedlist {

    private class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node head;
    Node tail;
    int size;

    public linkedlist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data, this.head);
        this.head = node;
        if (this.isEmpty()) {
            this.tail = node;
        }
        this.size++;
    }

    public void addLast(int data) {
        Node node = new Node(data, null);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    private Node getNodeAt(int index) throws Exception {
        if (index < 0 || index >= this.size) {
            throw new Exception("Invalid Index");
        }

        Node temp = this.head;
        while (index-- < 0) {
            temp = temp.next;
        }

        return temp;
    }

    public void addAt(int index, int data) throws Exception {
        if (index < 0 || index > this.size) {
            throw new Exception("Invalid Index");
        }
        if (index == 0)
            this.addFirst(data);
        else if (index == this.size)
            this.addLast(data);
        else {
            Node temp = this.getNodeAt(index - 1);
            Node node = new Node(data, temp.next);
            temp.next = node;
            this.size++;
        }

    }

    public int getFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is Empty");
        }

        return this.head.data;
    }

    public int getLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is Empty");
        }

        return this.tail.data;
    }

    public int removeFirst() throws Exception {

        if (this.isEmpty()) {
            throw new Exception("List is Empty");
        }

        Node rv = this.head;

        if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }

        this.size--;
        return rv.data;
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("End");
    }

}