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
public class Q0237_DeleteNodeInALinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        Utility.printListNode(head);
        deleteNode(head.next.next);
        Utility.printListNode(head);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
