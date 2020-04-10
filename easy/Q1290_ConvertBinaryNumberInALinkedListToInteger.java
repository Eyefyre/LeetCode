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
public class Q1290_ConvertBinaryNumberInALinkedListToInteger {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        System.out.println(getDecimalValue(head));
    }

    public static int getDecimalValue(ListNode head) {
        StringBuilder builder = new StringBuilder();
        ListNode current = head;
        while (current != null) {
            builder.append(current.val);
            current = current.next;
        }
        return Integer.parseInt(builder.toString(),2);
    }
}
