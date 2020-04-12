/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medium.done;

import CustomObjects.ListNode;

/**
 *
 * @author Adam
 */
public class Q0707_DesignLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(4);
        list.addAtTail(3);
        list.addAtTail(2);
        list.addAtHead(1);
        System.out.println(list.get(0));
    }
}

class MyLinkedList {

    /**
     * Initialize your data structure here.
     */
    private ListNode root = null;
    private int size = 0;

    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        } else {
            ListNode current = root;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.val;
        }
    }

    /**
     * Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked
     * list.
     */
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (root == null) {
            root = newNode;
        } else {
            newNode.next = root;
            root = newNode;
        }
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (root == null) {
            addAtHead(val);
        } else {
            ListNode newNode = new ListNode(val);
            ListNode current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            size++;
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If
     * index equals to the length of linked list, the node will be appended to
     * the end of linked list. If index is greater than the length, the node
     * will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {

        } else if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            ListNode newNode = new ListNode(val);
            ListNode current = root;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
        } else if (index == 0) {
            removeAtHead();
        } else if (index == size - 1) {
            removeAtTail();
        } else {
            ListNode current = root;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            ListNode temp = current.next;
            current.next = temp.next;
            size--;
        }
    }

    public void removeAtHead() {
        if (root != null) {
            root = root.next;
            size--;
        }
    }

    public void removeAtTail() {
        ListNode current = root;
        for (int i = 0; i < size - 2; i++) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
}
