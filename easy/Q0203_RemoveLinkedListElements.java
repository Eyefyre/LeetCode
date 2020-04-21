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
public class Q0203_RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(3);
        Utility.printListNode(head);
        removeElements(head, 3);
        Utility.printListNode(head);

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode current = helper;

        while (current.next != null) {
            if (current.next.val == val) {
                ListNode next = current.next;
                current.next = next.next;
            } else {
                current = current.next;
            }
        }
        return helper.next;
    }

}
