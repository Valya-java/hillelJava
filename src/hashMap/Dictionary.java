package hashMap;

import java.util.ArrayList;

public class Dictionary {
    private final int NUM_BUCKETS = 16;
    public Entry[] data = new Entry[NUM_BUCKETS];

    public void put(String key, String value){
        int hash = calculateHash(key);
        int positiveHash = Math.abs(hash);
        int index = positiveHash % NUM_BUCKETS;


       Entry last =  data[index];
        data[index] = new Entry(last, key, value);
    }


    public String get(String key) {
        int hash = calculateHash(key);
        int positiveHash = Math.abs(hash);
        int index = positiveHash % NUM_BUCKETS;

            Entry current = data[index];
            while ((current!=null)) {
                if (current.key.equals(key))
                    return current.value;
                else current = current.next;
            }
            return null;

        }



    private static class Entry{
        Entry next;
        String key;
        String value;

        public Entry(Entry next, String key, String value) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private int calculateHash(String string){
        return string.hashCode();
    }



}
