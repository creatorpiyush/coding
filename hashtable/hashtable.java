package hashtable;

public class hashtable<K, V> {
    private class HTPairs {
        K key;
        V value;

        public HTPairs(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object obj) {
            HTPairs op = (HTPairs) obj;
            return this.key.equals(op.key);
        }

        public String toString() {
            return "{" + this.key + ":" + this.value + "}";
        }
    }

    public static final int DEFAULT_CAPACITY = 10;
    private linkedlist<HTPairs>[] bucketArray;
    private int size;

    public hashtable() {
        this(DEFAULT_CAPACITY);
    }

    public hashtable(int capacity) {
        this.bucketArray = (linkedlist<HTPairs>[]) new linkedlist[capacity];
        this.size = 0;
    }

    public void put(K key, V value) throws Exception {

        int bi = this.hashFunction(key);
        linkedlist<HTPairs> bucket = this.bucketArray[bi];
        HTPairs pta = new HTPairs(key, value);
        if (bucket == null) {
            bucket = new LinkedList<>();
            bucket.addLast(pta);
            this.size++;
            this.bucketArray[bi] = bucket;
        } else{
            int foundAt = bucket.find(pta);
        }
    }

    private int hashFunction(K key) {
        int hc = key.hashCode();
        hc = Math.abs(hc);
        int bi = hc % this.bucketArray.length;
        return bi;
    }
}