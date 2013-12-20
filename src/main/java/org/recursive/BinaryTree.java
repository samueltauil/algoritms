package org.recursive;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: samueltauil
 * Date: 12/20/13
 * Time: 12:25 PM
 */
public class BinaryTree {

    public static class Node {
        Object register;
        Node left, right;

        public Node(Object s) {
            this.register = s;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "register=" + register +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public Node root;

    public void central(Node n){
        if (n != null) {
            central(n.left);
            central(n.right);
        }
    }
}
