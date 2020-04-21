/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import CustomObjects.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Adam
 */
public class Q0589_NaryTreePreorderTraversal {
    
    public static void main(String[] args) {
        Node root = new Node(1);
        List<Node> rootChildren = new ArrayList<>();
        Node three = new Node(3);
        List<Node> threeChildren = new ArrayList<>();
        three.children = threeChildren;
        threeChildren.add(new Node(5));
        threeChildren.add(new Node(6));
        rootChildren.add(three);
        rootChildren.add(new Node(2));
        rootChildren.add(new Node(4));
        root.children = rootChildren;
        
        List<Integer> results = preorder(root);
        System.out.println(results);
    }
    
    public static List<Integer> preorder(Node root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        Stack stack = new Stack();
        stack.push(root);
        while (!stack.empty()) {
            Node result = (Node) stack.pop();
            results.add(result.val);
            if (result.children != null) {
                for (int i = result.children.size() - 1; i > -1; i--) {
                    stack.push(result.children.get(i));
                }
            }
        }
        return results;
    }
}
