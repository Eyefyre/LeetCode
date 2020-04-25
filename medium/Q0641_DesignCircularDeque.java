/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medium.done;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Q0641_DesignCircularDeque {

    public static void main(String[] args) {

        MyCircularDeque circularDeque = new MyCircularDeque(3);
        circularDeque.insertLast(1);
        circularDeque.insertLast(2);
        circularDeque.insertFront(3);
        circularDeque.insertFront(4);
        circularDeque.getRear();
        circularDeque.isFull();
        circularDeque.deleteLast();
        circularDeque.insertFront(4);
        circularDeque.getFront();

    }
}

class MyCircularDeque {

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    private final List<Integer> values;
    private final int maxSize;

    public MyCircularDeque(int k) {
        values = new ArrayList<>();
        maxSize = k;
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is
     * successful.
     */
    public boolean insertFront(int value) {
        if (!this.isFull()) {
            values.add(0, value);
            return true;
        }
        return false;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is
     * successful.
     */
    public boolean insertLast(int value) {
        if (!this.isFull()) {
            values.add(value);
            return true;
        }
        return false;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is
     * successful.
     */
    public boolean deleteFront() {
        if (!this.isEmpty()) {
            values.remove(0);
            return true;
        }
        return false;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is
     * successful.
     */
    public boolean deleteLast() {
        if (!this.isEmpty()) {
            values.remove(values.size() - 1);
            return true;
        }
        return false;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (!isEmpty()) {
            return values.get(0);
        }
        return -1;
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (!isEmpty()) {
            return values.get(values.size() - 1);
        }
        return -1;
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return values.isEmpty();
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return (values.size() >= maxSize);
    }
}
