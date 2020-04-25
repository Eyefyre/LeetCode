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
public class Q0938_RangeSumOfBST {

    public static void main(String[] args) {

    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.empty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if (current.val >= L && current.val <= R) {
                sum += current.val;
            }
            current = current.right;
        }
        return sum;
    }
}
