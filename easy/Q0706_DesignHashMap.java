/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Q0706_DesignHashMap {

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 1);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }
}

class MyHashMap {

    private final List<HashMapEntry> container = new ArrayList<>();

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {

    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        if (contains(key)) {
            for (HashMapEntry entry : container) {
                if (entry.getKey() == key) {
                    entry.setValue(value);
                }
            }
        } else {
            HashMapEntry newEntry = new HashMapEntry(key, value);
            this.container.add(newEntry);
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map
     * contains no mapping for the key
     */
    public int get(int key) {
        for (HashMapEntry entry : container) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a
     * mapping for the key
     */
    public void remove(int key) {
        HashMapEntry entryForRemoval = null;
        if (contains(key)) {
            for (HashMapEntry entry : container) {
                if (entry.getKey() == key) {
                    entryForRemoval = entry;
                }
            }
        }
        if (entryForRemoval != null) {
            container.remove(entryForRemoval);
        }
    }

    public boolean contains(int key) {
        for (HashMapEntry entry : container) {
            if (entry.getKey() == key) {
                return true;
            }
        }
        return false;
    }
}

class HashMapEntry {

    private final int key;
    private int value;

    public HashMapEntry(int key, int val) {
        this.key = key;
        this.value = val;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int val) {
        this.value = val;
    }

}
