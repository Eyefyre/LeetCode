/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import java.util.Stack;

/**
 *
 * @author Adam
 */
public class Q0232_ImplementQueueUsingStacks {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}

class MyQueue {

    /**
     * Initialize your data structure here.
     */
    Stack values;

    public MyQueue() {
        values = new Stack();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        values.add(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return (int)values.remove(0);
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return (int)values.get(0);
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return values.isEmpty();
    }
}
