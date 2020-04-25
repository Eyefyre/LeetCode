/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hard.done;

import CustomObjects.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Adam
 */
public class Q0145_BinaryTreePostOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(root));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode previous = null;
        while (!stack.empty()) {
            TreeNode current = stack.peek();
            if (previous == null || previous.left == current || previous.right == current) {
                if (current.left != null) {
                    stack.push(current.left);
                } else if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    results.add(current.val);
                }
            } else if (current.left == previous) {
                if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    results.add(current.val);
                }
            } else if (current.right == previous) {
                stack.pop();
                results.add(current.val);
            }
            previous = current;
        }
        return results;
    }
}
