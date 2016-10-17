package dataStructures.hashtable;

public class TestHashMap {

    public static void main(String[] args) {
    }
}


class HashMap {

    private final static int CAPACITY = 10;

    private LinkedHashEntry[] table;

    HashMap() {
        table = new LinkedHashEntry[CAPACITY];
    }

    public int get(int key) {
        int hash = key % CAPACITY;
        if (table[hash] == null) {
            return -1;
        } else {
            LinkedHashEntry entry = table[hash];
            while (entry != null && entry.getKey() != key) {
                entry = entry.getNext();
            }

            if (entry == null) {
                return -1;
            } else {
                return entry.getValue();
            }

        }
    }

    public void put(int key, int value) {

    }

    public void remove(int key) {

    }


}