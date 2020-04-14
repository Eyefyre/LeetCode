/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import CustomObjects.TreeNode;

/**
 *
 * @author Adam
 */
public class Q0100_SameTree {

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        one.left = new TreeNode(2);
        one.right = new TreeNode(3);
        TreeNode two = new TreeNode(1);
        two.left = new TreeNode(2);
        two.right = new TreeNode(2);
        System.out.println(isSameTree(one, two));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            boolean a = (p.val == q.val);
            boolean b = isSameTree(p.left, q.left);
            boolean c = isSameTree(p.right, q.right);
            if (a && b && c) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
