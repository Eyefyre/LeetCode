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
public class Q0155_MinStack {

    public static void main(String[] args) {
        MinStack minstack = new MinStack();
        minstack.push(-2);
        minstack.push(0);
        minstack.push(-3);
        System.out.println(minstack.getMin());
        minstack.pop();
        System.out.println(minstack.top());
        System.out.println(minstack.getMin());
    }
}

class MinStack {

    private final List<Integer> values;

    public MinStack() {
        values = new ArrayList<>();
    }

    public void push(int x) {
        values.add(x);
    }

    public void pop() {
        values.remove(values.size() - 1);
    }

    public int top() {
        return values.get(values.size()-1);
    }

    public int getMin() {
        int minimum = Integer.MAX_VALUE;
        for (Integer num : values) {
            if (num < minimum) {
                minimum = num;
            }
        }
        return minimum;
    }
}
