/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import CustomObjects.ListNode;
import Utility.Utility;
/**
 *
 * @author Adam
 */
public class Q0206_ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        Utility.printListNode(head);
        head = reverseListRecursive(head);
        Utility.printListNode(head);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rest = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }


}
