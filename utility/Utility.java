/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import CustomObjects.ListNode;
import CustomObjects.TreeNode;

/**
 *
 * @author Adam
 */
public class Utility {

    public static void printArray(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]).append(",");
        }
        System.out.println(builder.toString());
    }
    public static void printArray(String[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]).append(",");
        }
        System.out.println(builder.toString());
    }

    public static void printListNode(ListNode node) {
        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.val);
            node = node.next;
        }
        System.out.println(builder.toString());
    }

    public static void printTreeNode(TreeNode node) {
        StringBuilder builder = new StringBuilder();
        printTree(node, builder);
        System.out.println(builder.toString());
    }

    private static void printTree(TreeNode node, StringBuilder builder) {
        if (node == null) {
            return;
        }
        printTree(node.left, builder);
        builder.append(node.val);
        printTree(node.right, builder);
    }
}
