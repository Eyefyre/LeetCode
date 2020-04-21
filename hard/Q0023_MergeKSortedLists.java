/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hard.done;

import CustomObjects.ListNode;
import Utility.Utility;

/**
 *
 * @author Adam
 */
public class Q0023_MergeKSortedLists {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        one.next = new ListNode(4);
        one.next.next = new ListNode(5);
        ListNode two = new ListNode(1);
        two.next = new ListNode(3);
        two.next.next = new ListNode(4);
        ListNode three = new ListNode(2);
        three.next = new ListNode(6);
        ListNode[] lists = {one,two,three};
        ListNode result = mergeKLists(lists);
        Utility.printListNode(result);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        for (int i = 0; i < lists.length; i++) {
            result = mergeTwoLists(result,lists[i]);
        }
        return result;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
