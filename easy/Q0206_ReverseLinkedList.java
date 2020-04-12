/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import CustomObjects.ListNode;

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
        print(head);
        head = reverseList(head);
        print(head);
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

    public static void print(ListNode node) {
        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.val);
            node = node.next;
        }
        System.out.println(builder.toString());
    }

}
