/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import CustomObjects.TreeNode;
import java.util.Stack;

/**
 *
 * @author Adam
 */
public class Q0965_UnivaluedBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        System.out.println(isUnivalTree(root));
    }

    public static boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack nodeStack = new Stack();
        nodeStack.push(root);
        while (nodeStack.empty() == false) {
            TreeNode mynode = (TreeNode) nodeStack.pop();
            if (mynode.right != null) {
                if (mynode.right.val != root.val) {
                    return false;
                }
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                if (mynode.left.val != root.val) {
                    return false;
                }
                nodeStack.push(mynode.left);
            }
        }
        return true;
    }
}
