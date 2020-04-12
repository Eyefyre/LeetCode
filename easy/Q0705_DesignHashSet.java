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
public class Q0705_DesignHashSet {

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(3));
        set.add(2);
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));
    }
}

class MyHashSet {

    private final List<Integer> container = new ArrayList<>();

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {

    }

    public void add(int key) {
        if (!contains(key)) {
            container.add(key);
        }
    }

    public void remove(int key) {
        if (contains(key)) {
            container.remove((Integer)key);
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return container.contains(key);
    }
}
