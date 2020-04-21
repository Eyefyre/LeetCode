/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medium.done;

import CustomObjects.ListNode;
import java.util.Random;

/**
 *
 * @author Adam
 */
public class Q0382_LinkedListRandomNode {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Q0382Solution sol = new Q0382Solution(head);
        System.out.println(sol.getRandom());
    }
}

class Q0382Solution {

    /**
     * @param head The linked list's head. Note that the head is guaranteed to
     * be not null, so it contains at least one node.
     */
    ListNode head;

    public Q0382Solution(ListNode head) {
        this.head = head;
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        Random random = new Random();
        int number = -1;
        while (number == -1) {
            ListNode current = this.head;
            while (current != null) {
                if (random.nextInt(100) > 90) {
                    number = current.val;
                }
                current = current.next;
            }
        }
        return number;
    }
}
