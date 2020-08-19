package hashtable;

/**
 * hashtable
 */
public class hashtable<K, V> {

    private class HTPair {
        K key;
        V value;

        public HTPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object obj) {
            HTPair op = (HTPair) obj;
            return this.key.equals(op.key);
        }

        public String toString() {
            return "{" + this.key + ":" + this.value + "}";
        }
    }

    public static final int DEFAULT_CAPACITY = 10;
    private linkedlist<HTPair>[] bucketarray;
    private int size;

    public hashtable() {
        this(DEFAULT_CAPACITY);
    }

    public hashtable(int capacity) {
        this.bucketarray = (linkedlist<HTPair>[]) new linkedlist[capacity];
        this.size = 0;
    }

    public void put(K key, V value) throws Exception {
        int bi = this.hashFunction(key);
        linkedlist<HTPair> bucket = this.bucketarray[bi];
        HTPair pta = new HTPair(key, value);
        if (bucket == null) {
            bucket = new linkedlist<>();
            bucket.addLast(pta);
            this.size++;
            this.bucketarray[bi] = bucket;
        } else {
            int foundAt = bucket.find(pta);
            if (foundAt == -1) {
                bucket.addLast(pta);
                this.size++;
            } else {
                HTPair pair = bucket.getAt(foundAt);
                pair.value = value;
            }
        }

        double lamda = (this.size * 1.0) / this.bucketarray.length;
        if (lamda > 0.75) {
            this.rehash();
        }
    }

    public String toString() {
        String str = "";
        for (linkedlist<HTPair> bucket : this.bucketarray) {
            if (bucket != null && !bucket.isEmpty()) {
                str = str + bucket;
            } else {
                str = str + "Null";
            }
            str = str + "\n";
            str = str + "~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        }
        str = str + "\n";
        str = str + "*******************************";
        return str;
    }

    public V get(K key) throws Exception {
        int bi = this.hashFunction(key);
        linkedlist<HTPair> bucket = this.bucketarray[bi];
        HTPair ptf = new HTPair(key, null);
        if (bucket == null) {
            return null;
        } else {
            int foundAt = bucket.find(ptf);
            if (foundAt == -1) {
                return null;
            } else {
                HTPair pair = bucket.getAt(foundAt);
                return pair.value;
            }
        }
    }

    public V remove(K key) throws Exception {
        int bi = this.hashFunction(key);
        linkedlist<HTPair> bucket = this.bucketarray[bi];
        HTPair ptf = new HTPair(key, null);
        if (bucket == null) {
            return null;
        } else {
            int foundAt = bucket.find(ptf);
            if (foundAt == -1) {
                return null;
            } else {
                HTPair pair = bucket.getAt(foundAt);
                bucket.removeAt(foundAt);
                this.size--;
                return pair.value;
            }
        }
    }

    private int hashFunction(K key) {
        int hc = key.hashCode();
        hc = Math.abs(hc);
        int bi = hc % this.bucketarray.length;
        return bi;
    }

    private void rehash() throws Exception {
        linkedlist<HTPair>[] oba = this.bucketarray;
        this.bucketarray = (linkedlist<HTPair>[]) new linkedlist[2 * oba.length];
        this.size = 0;
        for (linkedlist<HTPair> ob : oba) {
            while (ob != null && !ob.isEmpty()) {
                HTPair rp = ob.removeFirst();
                this.put(rp.key, rp.value);
            }
        }
    }
}