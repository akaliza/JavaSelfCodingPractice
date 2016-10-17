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
        int hash = key % CAPACITY;

        LinkedHashEntry linkedHashEntry = new LinkedHashEntry(key, value);

        LinkedHashEntry item = table[hash];

        if(item==null){
            table[hash] = linkedHashEntry;
        }else{
            while(item.getNext() != null &&item.getKey() != key ){
                item = item.getNext();
            }
            if(item.getKey() == key){
                item.setValue(value);
            }else{
                item.setNext(linkedHashEntry);

            }
        }

    }

    public void remove(int key) {
        int hash = key % CAPACITY;
        LinkedHashEntry item = table[hash];

        if(item!=null){

            LinkedHashEntry prev = null;
            while(item.getKey()!=key){
                prev= item;
                item = item.getNext();
            }

            if(item.getKey()==key){
                if(prev==null){
                    table[hash] = item.getNext();
                }else{
                    prev.setNext(item.getNext());
                }
            }
        }



    }


}