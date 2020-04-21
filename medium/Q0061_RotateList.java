/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medium.done;

import CustomObjects.ListNode;
import Utility.Utility;

/**
 *
 * @author Adam
 */
public class Q0061_RotateList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Utility.printListNode(head);
        head = rotateRight(head, 4);
        Utility.printListNode(head);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sizeFinder = head;
        int size = 0;
        while (sizeFinder != null) {
            size++;
            sizeFinder = sizeFinder.next;
        }
        for (int i = 0; i < k % size; i++) {
            ListNode current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            ListNode last = current.next;
            current.next = null;
            last.next = head;
            head = last;
        }
        return head;
    }

}
