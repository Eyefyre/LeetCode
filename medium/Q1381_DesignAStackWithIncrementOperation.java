/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medium.done;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Q1381_DesignAStackWithIncrementOperation {

    public static void main(String[] args) {
        CustomStack obj = new CustomStack(3);
        obj.push(2);
        obj.push(4);
        obj.push(10);
        int param_2 = obj.pop();
        obj.increment(6, 5);
        System.out.println(obj.stack);
    }
}

class CustomStack {

    int maxSize = 0;
    ArrayList<Integer> stack;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayList<>();
    }

    public void push(int x) {
        if (stack.size() < this.maxSize) {
            stack.add(x);
        }
    }

    public int pop() {
        if(stack.isEmpty()){
            return -1;
        }
        int x = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return x;
    }

    public void increment(int k, int val) {
        if (k >= stack.size()) {
            k = stack.size();
        }
        for (int i = 0; i < k; i++) {
            stack.set(i, stack.get(i) + val);
        }
    }
}
